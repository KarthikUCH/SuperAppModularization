package com.raju.karthikeyan.appmodularization

import android.app.Application
import com.raju.karthikeyan.lib_costumer.api.CustomerApi
import com.raju.karthikeyan.lib_shoppingcart.api.ShoppingCartApi

class ModularApp: Application() {

    override fun onCreate() {
        super.onCreate()
        commonInit()
    }

    private fun commonInit() {
        initShoppintCart()
        initCustomer()
    }

    private fun initCustomer() {
        CustomerApi
            .Builder(this)
            .build()
    }

    private fun initShoppintCart() {

        ShoppingCartApi
            .Builder(this)
            .build()
    }
}