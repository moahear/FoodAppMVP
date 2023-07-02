package com.gamil.moahear.foodappmvp.utils.di

import androidx.fragment.app.Fragment
import com.gamil.moahear.foodappmvp.ui.home.HomeContracts
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.FragmentComponent

@Module
@InstallIn(FragmentComponent::class)
object ContractsModule {
    @Provides
    fun provideHomeView(fragment: Fragment):HomeContracts.View=fragment as HomeContracts.View
}