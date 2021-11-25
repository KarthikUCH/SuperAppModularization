package com.raju.karthikeyan.lib_shoppingcart.api

import android.content.Context
import com.raju.karthikeyan.lib_costumer.model.Customer
import com.raju.karthikeyan.lib_shoppingcart.ShoppingCartManager

class ShoppingCartApi private constructor(val builder: Builder) : ShoppingCartContract {

    private lateinit var shoppingCartListener: ShoppingCartListener

    override fun addCustomer(customer: Customer) {
        ShoppingCartManager.addCustomer(customer)
    }

    override fun getCustomer() {
        return ShoppingCartManager.getCustomer()
    }

    fun setShoppingCartListener(shoppingCartListener: ShoppingCartListener) {
        this.shoppingCartListener = shoppingCartListener
    }

    fun getShoppingCartListener() =  shoppingCartListener

    /*fun addDiscount(discount: Discount){

    }

    fun addTax(tax: Tax){

    }

    fun addGratuity(item: Gratuity){

    }*/

    class Builder(val context: Context) {

        fun build(): ShoppingCartApi = ShoppingCartApi(this)
    }

    companion object {
        @JvmStatic
        @Volatile
        private var INSTANCE: ShoppingCartApi? = null

        @Synchronized
        fun getInstance(): ShoppingCartApi = INSTANCE
            ?: throw RuntimeException("ShoppingCartApi is not initialized yet. Please use ShoppingCartApi.Builder(context)")
    }
}