package com.juadlopez2186.appbolsillos

class arrays {
}

fun main() {
    var pets= arrayOf("dog","cat","canary")
    println(pets.contentToString())
    println(pets[1])
    pets[2]="parrot";
    println(pets.contentToString())
    for (element in pets){
        println("la mascota es $element")
    }
    for ((index,element) in pets.withIndex()){
        println("la mascota en la posicion $index es $element ")
    }
    var instruments = mutableListOf<String>("trumpet","piano","violin")
    println(instruments)
    var instrumentos=listOf("trumpet","piano","violin")
    println(instrumentos)
    println(instruments[1])
    instruments[2]="guitar"
    println(instruments)
    println(pets.last())
    println(pets.first())
    instruments.add("holo")
}