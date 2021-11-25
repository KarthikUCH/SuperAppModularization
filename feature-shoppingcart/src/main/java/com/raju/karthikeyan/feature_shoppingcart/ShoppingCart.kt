package com.raju.karthikeyan.feature_shoppingcart

class ShoppingCart(
) {

    private var id: Long = 0
    private var guid: String = ""
    private var customer: ScCustomer? = null
    private var location: String = ""
    private var grossAmount: Long = 0

    fun getCustomer(): ScCustomer? {
        return customer
    }

    fun setGuid(guid: String) {
        this.guid = guid
    }
}

data class ScCustomer(
    val name: String, val Id: Long, val phoneNumber: String,
    val image: String,
    val state: String,
    val province: String
)


