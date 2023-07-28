package com.Cristian2006.ejercicio.ejercicio

class Introduccion {
}


fun main() {
    var No_identificacion: Int = 0
    var nombres: String = ""
    var apellidos: String = ""
    var serial_pantalla: Int = 0
    var serial_torre: Int = 0
    var No_equipo: Int = 0
    var serial_teclado: Int = 0
    var serial_mouse: Int = 0
    var observaciones: String = ""

    println("Ingrese su No de identificacion")
    No_identificacion = readLine()?.toInt() ?: 0
    println("Ingrese sus nombres")
    nombres = readLine()?.toString() ?: ""
    println("Ingrese sus apellidos")
    apellidos = readLine()?.toString() ?: ""
    println("Ingrese su serial de pantalla")
    serial_pantalla = readLine()?.toInt() ?: 0
    println("Ingrese su serial de torre")
    serial_torre = readLine()?.toInt() ?: 0
    println("Ingrese su numero de equipo")
    No_equipo = readLine()?.toInt() ?: 0
    println("Ingrese su serial de teclado")
    serial_teclado = readLine()?.toInt() ?: 0
    println("Ingrese su serial de mouse")
    serial_mouse = readLine()?.toInt() ?: 0
    println("Ingrese sus observaciones")
    observaciones = readLine()?.toString() ?: ""

    print("Su No de identificacion es $No_identificacion \n")
    print("Sus nombres son $nombres \n")
    print("Sus apellidos son $apellidos \n")
    print("Su serial de pantalla es $serial_pantalla \n")
    print("Su serial de torre es $serial_torre \n")
    print("Su No de equipo es $No_equipo \n")
    print("Su serial de teclado es $serial_teclado \n")
    print("Su serial de mouse es $serial_mouse \n")
    print("Sus observaciones son $observaciones \n")
}