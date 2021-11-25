package com.raju.karthikeyan.lib_shoppingcart

import com.raju.karthikeyan.lib_costumer.model.Customer
import com.raju.karthikeyan.lib_shoppingcart.api.ShoppingCartApi
import com.raju.karthikeyan.lib_shoppingcart.model.ShoppingCart

object ShoppingCartManager {
    var shoppingCart = ShoppingCart()

    fun addCustomer(customer: Customer) {
        shoppingCart.addCustomer(customer)
        ShoppingCartApi.getInstance().getShoppingCartListener().onCustomerAdded()
    }

    fun getCustomer() {
        shoppingCart.getCustomer()
    }

    fun generateGuid(){
        // Random function to generate GUID
        shoppingCart.setGuid("random-guid")
    }

    fun clear(){
        shoppingCart = ShoppingCart()
    }
}