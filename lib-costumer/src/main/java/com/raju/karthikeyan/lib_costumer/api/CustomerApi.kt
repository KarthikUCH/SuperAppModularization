package com.raju.karthikeyan.lib_costumer.api

import android.content.Context
import com.raju.karthikeyan.lib_costumer.model.Customer

class CustomerApi private constructor(val builder: Builder): CustomerContract {
    override fun getCustomer(customerId: String): Customer {
        // Assume as getting customer from any persistance storage
        return Customer("Customer  Name", 1000, "+92 11101110", "profile mage", "", "")
    }

    class Builder(val context: Context) {

        fun build(): CustomerApi = CustomerApi(this)
    }

    companion object {
        @JvmStatic
        @Volatile
        private var INSTANCE: CustomerApi? = null

        @Synchronized
        fun getInstance(): CustomerApi = INSTANCE
            ?: throw RuntimeException("CustomerApi is not initialized yet. Please use ShoppingCartApi.Builder(context)")
    }
}