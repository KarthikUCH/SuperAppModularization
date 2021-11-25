package com.raju.karthikeyan.lib_shoppingcart.model

import com.raju.karthikeyan.lib_costumer.model.Customer

class ShoppingCart(
) {

    private var id: Long = 0
    private var guid: String = ""
    private var customer: ScCustomer? = null
    private var location: String = ""
    private var grossAmount: Long = 0

    fun addCustomer(customer: Customer) {
        // convert customer to ScCustomer and add
        val scCustomer = ScCustomer(
            customer.name,
            customer.id,
            customer.phoneNumber,
            customer.image,
            customer.state,
            customer.province
        )
        this.customer = scCustomer
    }

    fun getCustomer(): ScCustomer? {
        return customer
    }

    fun setGuid(guid: String){
        this.guid = guid
    }

    /*fun addItem(item: Item){

    }

    fun addDiscount(discount: Discount){

    }

    fun addTax(tax: Tax){

    }

    fun addGratuity(item: Gratuity){

    }*/
}

data class ScCustomer(
    val name: String, val Id: Long, val phoneNumber: String,
    val image: String,
    val state: String,
    val province: String
)


