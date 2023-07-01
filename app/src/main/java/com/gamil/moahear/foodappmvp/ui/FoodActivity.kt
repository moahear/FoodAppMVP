package com.gamil.moahear.foodappmvp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import com.gamil.moahear.samplemvp.R
import com.gamil.moahear.samplemvp.databinding.ActivityFoodBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class FoodActivity : AppCompatActivity() {
    private lateinit var binding:ActivityFoodBinding
    private lateinit var navHostFragment: NavHostFragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityFoodBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //Nav controller
        navHostFragment=supportFragmentManager.findFragmentById(R.id.fragmentContainerView) as NavHostFragment

    }
}