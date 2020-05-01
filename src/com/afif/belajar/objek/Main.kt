package com.afif.belajar.objek

class Cart{

    var product = "laptop"

    fun addCart() {
        print("$product added to cart")
    }

}

fun main(){
    val cart = Cart()
    cart.addCart()
}