package com.raju.karthikeyan.appmodularization

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raju.karthikeyan.appmodularization.databinding.ActivityMainBinding
import com.raju.karthikeyan.lib_navigation.Activities

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        init()
    }

    private fun init(){
        binding.btnShoppingCart.setOnClickListener {
            openShoppingCartActivity()
        }

        binding.btnCustomer.setOnClickListener {
            openCustomerActivity()
        }
    }

    private fun openShoppingCartActivity() {
        applicationContext.startActivity(Activities.intentForShoppingCart(this))
    }

    private fun openCustomerActivity() {
        applicationContext.startActivity(Activities.intentForCustomer(this))
    }
}