package com.juadlopez2186.appbolsillos

class ciclos {
}

fun main() {
 var res=(0..50).random()
    when(res){
        0 -> println("no hay considencias")
        in 1..10 -> println("hay $res concidencias")
        in 11..19 -> println("hay $res concidencias")
        in 20..50 -> println("hay $res concidencias")
    }
}