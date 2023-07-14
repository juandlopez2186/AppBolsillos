package com.juadlopez2186.appbolsillos

class aleatorios {
}

fun main() {
    var numAlt=(1..20).random()
    println("ingrese un numero del 1 a 20")
    var num= readLine()!!.toInt()
    if (num in 1..20){
        println("bien,esta dentro del rango")
    }
    else{
        println("te dije un numero del 1 al 20")
    }
}