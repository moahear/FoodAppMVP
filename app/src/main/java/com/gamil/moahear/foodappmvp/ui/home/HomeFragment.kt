package com.gamil.moahear.foodappmvp.ui.home

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import coil.load
import com.gamil.moahear.foodappmvp.data.model.home.ResponseFoods
import com.gamil.moahear.foodappmvp.utils.isNetworkAvailable
import com.gamil.moahear.samplemvp.R
import com.gamil.moahear.samplemvp.databinding.FragmentHomeBinding
import com.jakewharton.rxbinding4.widget.textChanges
import dagger.hilt.android.AndroidEntryPoint
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers
import java.util.concurrent.TimeUnit
import javax.inject.Inject

@AndroidEntryPoint
class HomeFragment : Fragment(),HomeContracts.View {

private lateinit var binding:FragmentHomeBinding
@Inject
lateinit var homePresenter: HomePresenter

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        binding=FragmentHomeBinding.inflate(inflater,container,false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            //Call api
            homePresenter.callGetRandomFood()


            filterFoods()
            //Search
            edtSearch.textChanges().skipInitialValue()
                .debounce(500,TimeUnit.MILLISECONDS)
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe {
                    //Call api

                }
        }
    }
    private fun FragmentHomeBinding.filterFoods() {
        val filters= listOf('A'..'Z').flatten()
        val adapter=ArrayAdapter(requireContext(), R.layout.spinner_english_alphabet,filters)
        adapter.setDropDownViewResource(R.layout.spinner_list_english_alphabet)
        spinnerFilter.adapter=adapter
        spinnerFilter.onItemSelectedListener=object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                //Call
            }

            override fun onNothingSelected(parent: AdapterView<*>?) {

            }
        }
    }

    override fun showRandomFood(data: ResponseFoods) {
     binding.imgHeader.load(data.meals?.get(0)?.strMealThumb){
         crossfade(true)
         crossfade(600)
     }
    }

    override fun showLoading() {

    }

    override fun hideLoading() {

    }

    override fun checkInternet(): Boolean {
     return requireContext().isNetworkAvailable()
    }

    override fun internetError(hasInternet: Boolean) {

    }

    override fun serverError(message: String) {

    }

}