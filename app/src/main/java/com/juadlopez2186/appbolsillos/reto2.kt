package com.juadlopez2186.appbolsillos

class reto2 {
}

fun main() {
    println("digite el precio de la compra")
    var price = readLine()!!.toInt()
    var alt = (1..5).random()
    if (price > 50000) {
        if (alt==1) {
            var qui=price/10*100
            var rest=price-qui
            println("felicidades su cpmpra tuvo un descuento del 10% gracias a una balota roja el precio de la compra es de $rest")
        } else if (alt==2) {
            var qui=price/30*100
            var rest=price-qui
            println("felicidades su cpmpra tuvo un descuento del 30% gracias a una balota roja el precio de la compra es de $rest")
        }
        else if (alt==3) {
            var qui=price/50*100
            var rest=price-qui
            println("felicidades su cpmpra tuvo un descuento del 50% gracias a una balota roja el precio de la compra es de $rest")
        }
        else if (alt==4) {
            println("felicidades su cpmpra es gratis gracias a una balota blanca")
        }
        else if (alt==5) {
            println("el precio de la compra es de $price")
        }
    }
}

