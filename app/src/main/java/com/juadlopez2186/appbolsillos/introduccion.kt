package com.juadlopez2186.appbolsillos

class introduccion {
}

fun main() {
    print("digite su nombre \n")
    var name =readLine()
    print("digite su apellido \n")
    var lastName= readLine()
    print("digite su edad \n")
    var age= readLine()!!.toInt()
    println(" En 10 años $name $lastName tendra ${age+10}")
}