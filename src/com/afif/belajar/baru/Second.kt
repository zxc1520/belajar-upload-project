package com.afif.belajar.baru

fun main() {
    Student.getToSchool()
}

object Student {

    val name = "Joe"

    fun getToSchool() {
        print("$name going to school")
    }

}
