package com.raju.karthikeyan.lib_shoppingcart.api

interface ShoppingCartListener {
    fun onCustomerAdded()

    fun onCustomerRemoved()

    fun onItemAdded()

    fun onItemRemoved()

    fun onDiscountAdded()

    fun onDiscountRemoved()
}