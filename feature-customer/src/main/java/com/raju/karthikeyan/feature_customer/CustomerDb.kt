package com.raju.karthikeyan.feature_customer

object CustomerDb {
    fun getCustomer(id: Long): Customer {
        return Customer("Customer From Database", id, "+92 11101110", "", "", "")
    }
}