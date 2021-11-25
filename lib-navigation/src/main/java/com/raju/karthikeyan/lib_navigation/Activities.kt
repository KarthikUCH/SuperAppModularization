package com.raju.karthikeyan.lib_navigation

import android.content.Context
import android.content.Intent
import android.os.Bundle

object Activities {

    fun intentForShoppingCart(context: Context?, state: String = ""): Intent? {
        val args = Bundle().apply { putString(ExtraKey.SHOPPING_CART_EXTRA, state) }
        return Intent(ActivityClassName.APP_SHOPPING_CART).setPackage(context?.packageName)
            ?.apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
                putExtras(args)
            }
    }

    fun intentForCustomer(context: Context?, state: String = ""): Intent? {
        val args = Bundle().apply { putString(ExtraKey.CUSTOMER_EXTRA, state) }
        return Intent(ActivityClassName.APP_CUSTOMER).setPackage(context?.packageName)
            ?.apply {
                addFlags(Intent.FLAG_ACTIVITY_CLEAR_TASK or Intent.FLAG_ACTIVITY_NEW_TASK)
                putExtras(args)
            }
    }
}