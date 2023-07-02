package com.gamil.moahear.foodappmvp.data.server

import com.gamil.moahear.foodappmvp.data.model.home.ResponseFoods
import io.reactivex.rxjava3.core.Single
import retrofit2.Response
import retrofit2.http.GET

interface ApiServices {
    @GET("random.php")
    fun getRandomFood():Single<Response<ResponseFoods>>
}