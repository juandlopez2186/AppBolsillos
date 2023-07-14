package com.juadlopez2186.appbolsillos

class condicionales {
}

fun main() {
    println("digite un numero")
    var num1= readLine()!!.toInt()
    println("digite un segundo numero")
    var num2= readLine()!!.toInt()
    if (num1>num2){
        println( "$num1 es mayor que $num2")
    }
    else if (num1<num2){
        println( "$num1 es menor que $num2")
    }
    else if (num1==num2){
        println("los numeros son iguales")
    }
}