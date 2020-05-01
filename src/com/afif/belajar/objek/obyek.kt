package com.afif.belajar.objek

class Apel {
    companion object {
        fun desc(nama: String, harga: Int) {
            println("Ini adalah $nama dan harganya $harga")
        }

        fun sum(a: Int, b: Int, c: Int) {
            val res = a + b + c
            println(res)
        }
    }
}

fun main() {

    Apel.desc("Apel Malang", 12000)
    Apel.sum(2, 3, 4)

}