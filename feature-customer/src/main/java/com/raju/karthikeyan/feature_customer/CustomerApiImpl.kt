package com.raju.karthikeyan.feature_customer

import com.raju.karthikeyan.lib_costumer.api.CustomerContract
import com.raju.karthikeyan.lib_costumer.model.Customer

object CustomerApiImpl : CustomerContract {
    override fun getCustomer(customerId: Long): Customer {
        return CustomerDB.getCustomer(customerId)
    }
}