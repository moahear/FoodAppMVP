package com.gamil.moahear.foodappmvp.ui.home

import com.gamil.moahear.foodappmvp.data.model.home.ResponseFoods
import com.gamil.moahear.foodappmvp.utils.base.BasePresenter
import com.gamil.moahear.foodappmvp.utils.base.BaseView

interface HomeContracts {
    interface View:BaseView{
        fun showRandomFood(data:ResponseFoods)
    }

    interface Presenter:BasePresenter{
        fun callGetRandomFood()
    }
}