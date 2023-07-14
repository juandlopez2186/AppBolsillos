package com.juadlopez2186.appbolsillos

class reto1 {
}

fun main() {
    println("bienvenido al juego de los dados ")
    println("ganas con pares o con un total de 2,3,7,11 o 12")
    var ran1 = (1..6).random()
    var ran2 = (1..6).random()
    var rest = ran1 + ran2
    if (ran1 == ran2) {
        println("gano par de $ran1")

    } else if (rest==2) {
        println("gano total $rest")}
    else if (rest==3) {
        println("gano total $rest")}
    else if (rest==7) {
        println("gano total $rest")}
    else if (rest==11) {
        println("gano total $rest")}
    else if (rest==12) {
        println("gano total $rest")}
            else{
                println("perdio $ran1 $ran2")
            }
    }

