package com.raju.karthikeyan.lib_costumer

import com.raju.karthikeyan.lib_costumer.model.Customer

object CustomerDB {
    fun getCustomer(id: Long): Customer {
        return Customer("Customer From Database", id, "+92 11101110", "", "", "")
    }
}