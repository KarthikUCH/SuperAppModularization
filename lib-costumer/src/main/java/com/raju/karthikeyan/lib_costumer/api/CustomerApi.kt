package com.raju.karthikeyan.lib_costumer.api

import android.content.Context
import com.raju.karthikeyan.lib_costumer.model.Customer

class CustomerApi private constructor(val builder: Builder) : CustomerContract {

    var customerFeatureApi: CustomerContract

    init {
        INSTANCE = this
        this.customerFeatureApi = builder.customerFeatureApi
    }

    override fun getCustomer(customerId: Long): Customer {
        return customerFeatureApi.getCustomer(customerId)
    }

    class Builder(val context: Context) {
        lateinit var customerFeatureApi: CustomerContract

        fun withCustomerApi(customerFeatureApi: CustomerContract): Builder {
            this.customerFeatureApi = customerFeatureApi
            return this
        }

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