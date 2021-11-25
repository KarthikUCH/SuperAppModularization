package com.raju.karthikeyan.lib_costumer.api

import android.content.Context
import com.raju.karthikeyan.lib_costumer.CustomerDB
import com.raju.karthikeyan.lib_costumer.model.Customer

class CustomerApi private constructor(val builder: Builder): CustomerContract {

    init {
        INSTANCE = this
    }
    override fun getCustomer(customerId: Long): Customer {
        // Assume as getting customer from any persistance storage
        return CustomerDB.getCustomer(1)
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
            ?: throw RuntimeException("CustomerApi is not initialized yet. Please use CustomerApi.Builder(context)")
    }
}