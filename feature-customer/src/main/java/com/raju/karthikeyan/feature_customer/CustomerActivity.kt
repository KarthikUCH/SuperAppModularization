package com.raju.karthikeyan.feature_customer

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.raju.karthikeyan.feature_customer.databinding.ActivityCustomerBinding
import com.raju.karthikeyan.lib_costumer.api.CustomerApi
import com.raju.karthikeyan.lib_navigation.Activities

class CustomerActivity : AppCompatActivity() {
    private lateinit var binding: ActivityCustomerBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCustomerBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        init()
    }

    private fun init(){
        binding.tvCustomerData.text = CustomerApi.getInstance().getCustomer(1).name
        binding.buttonShoppingCart.setOnClickListener {
            openShoppingCartActivity()
        }
    }

    private fun openShoppingCartActivity() {
        applicationContext.startActivity(Activities.intentForShoppingCart(this))
    }
}