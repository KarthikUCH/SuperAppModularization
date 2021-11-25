package com.raju.karthikeyan.lib_costumer.api

import com.raju.karthikeyan.lib_costumer.model.Customer

interface CustomerContract {
    fun getCustomer(customerId: String): Customer
}