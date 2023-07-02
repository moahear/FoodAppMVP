package com.gamil.moahear.foodappmvp.data.repository

import com.gamil.moahear.foodappmvp.data.server.ApiServices
import javax.inject.Inject

class HomeRepository @Inject constructor(private val apiServices: ApiServices){
    fun getRandomFood()=apiServices.getRandomFood()
}