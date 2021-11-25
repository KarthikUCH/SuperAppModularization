package com.raju.karthikeyan.lib_shoppingcart.api

import com.raju.karthikeyan.lib_costumer.model.Customer
import com.raju.karthikeyan.lib_shoppingcart.model.ScCustomer

interface ShoppingCartContract {
    fun addCustomer(customer: Customer)

    fun getCustomer()
}