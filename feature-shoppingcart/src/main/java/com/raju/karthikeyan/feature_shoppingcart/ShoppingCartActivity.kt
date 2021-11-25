package com.raju.karthikeyan.feature_shoppingcart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raju.karthikeyan.feature_shoppingcart.databinding.ActivityShoppingCartBinding
import com.raju.karthikeyan.lib_navigation.Activities

class ShoppingCartActivity : AppCompatActivity() {
    private lateinit var binding: ActivityShoppingCartBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityShoppingCartBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        init()
    }

    private fun init(){
        binding.buttonCustomer.setOnClickListener {
            openCustomerActivity()
        }
    }

    private fun openCustomerActivity() {
        applicationContext.startActivity(Activities.intentForCustomer(this))
    }
}