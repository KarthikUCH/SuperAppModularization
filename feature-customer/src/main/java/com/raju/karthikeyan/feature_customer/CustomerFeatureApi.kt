package com.raju.karthikeyan.feature_customer

import android.content.Context
import com.raju.karthikeyan.lib_costumer.api.CustomerApi
import com.raju.karthikeyan.lib_costumer.api.CustomerContract
import com.raju.karthikeyan.lib_costumer.model.Customer

class CustomerFeatureApi : CustomerContract {

    override fun getCustomer(customerId: Long): Customer {
        return CustomerDB.getCustomer(customerId)
    }

     fun initCustomerLib(context: Context) {
        CustomerApi
            .Builder(context)
            .withCustomerApi(this)
            .build()
    }
}