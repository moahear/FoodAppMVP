package com.gamil.moahear.foodappmvp.utils.base

interface BaseView {
    fun showLoading()
    fun hideLoading()
    fun checkInternet(): Boolean
    fun internetError(hasInternet: Boolean)
    fun serverError(message:String)
}