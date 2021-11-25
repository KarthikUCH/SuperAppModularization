package com.raju.karthikeyan.feature_customer

import com.raju.karthikeyan.lib_costumer.model.Customer

object CustomerDB {
    fun getCustomer(id: Long): Customer {
        return Customer("Customer From Database Changed", id, "+92 11101110", "", "", "")
    }
}