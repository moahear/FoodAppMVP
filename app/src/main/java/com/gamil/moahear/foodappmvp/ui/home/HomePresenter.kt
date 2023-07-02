package com.gamil.moahear.foodappmvp.ui.home

import com.gamil.moahear.foodappmvp.data.repository.HomeRepository
import com.gamil.moahear.foodappmvp.utils.applyIoScheduler
import com.gamil.moahear.foodappmvp.utils.base.BasePresenterImpl
import javax.inject.Inject

class HomePresenter @Inject constructor(private val homeRepository: HomeRepository
,private val view:HomeContracts.View):HomeContracts.Presenter,BasePresenterImpl() {
    override fun callGetRandomFood() {
        if (view.checkInternet()) {
            disposable=homeRepository.getRandomFood().applyIoScheduler()
                .subscribe({response->
                    view.hideLoading()
                    when(response.code()){
                        in 200..202->{
                            response.body()?.let { view.showRandomFood(it) }
                        }
                        422->{}
                        in 400..499->{}
                        in 500..599->{

                        }
                    }
                },{error->
                    view.hideLoading()
                 view.serverError(error.message.toString())
                })
        }
        else{
            view.internetError(false)
        }
    }


}