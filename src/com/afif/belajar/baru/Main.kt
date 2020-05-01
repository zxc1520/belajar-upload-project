package com.afif.belajar.baru

class Cart {

    val product = "Laptop"

    fun addToCart() {
        print("$product added to cart")
    }

    init {
        addToCart()
    }

}

fun main() {
    Cart()
    //cart.addToCart()
}