package com.gamil.moahear.foodappmvp.utils.di

import com.gamil.moahear.foodappmvp.data.server.ApiServices
import com.gamil.moahear.foodappmvp.utils.Constants
import com.gamil.moahear.foodappmvp.utils.di.qualifier.BodyHttpLoggingInterceptor
import com.google.gson.Gson
import com.google.gson.GsonBuilder
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava3.RxJava3CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import java.util.concurrent.TimeUnit
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {
    @Provides
    @Singleton
    fun provideBaseUrl():String= Constants.BASE_URL

    @Provides
    @Singleton
    fun provideConnectionTimeout():Long=Constants.CONNECTION_TIME

    @Provides
    @Singleton
    @BodyHttpLoggingInterceptor
    fun provideBodyHttpLoggingInterceptor():HttpLoggingInterceptor=HttpLoggingInterceptor().apply {
        level=HttpLoggingInterceptor.Level.BODY
    }

    @Provides
    @Singleton
    fun provideGson():Gson=GsonBuilder().setLenient().create()

    @Provides
    @Singleton
    fun provideClient(connectionTimeout:Long,@Body bodyInterceptor: HttpLoggingInterceptor):OkHttpClient=
        OkHttpClient.Builder()
            .readTimeout(connectionTimeout,TimeUnit.SECONDS)
            .writeTimeout(connectionTimeout,TimeUnit.SECONDS)
            .connectTimeout(connectionTimeout,TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)
            .addInterceptor(bodyInterceptor)
            .build()


    @Provides
    @Singleton
    fun provideRetrofit(baseUrl:String,client: OkHttpClient,gson: Gson): ApiServices =
        Retrofit.Builder()
            .baseUrl(baseUrl)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .addCallAdapterFactory(RxJava3CallAdapterFactory.create())
            .build().create(ApiServices::class.java)
}