package com.juadlopez2186.appbolsillos

class ciclos2 {
}

fun main() {
    println("digite el inicio de numeros ")
    var ini= readLine()!!.toInt()
    println("digite el limite de numeros ")
    var lim= readLine()!!.toInt()
    var pr=0
    var ipr=0
    var pa=0
    var per=0
    for (i in ini..lim) {
        var n = i % 2
        if (ini >=1) {
            if (n == 0) {
                pr = pr + 1
                pa = pa + i
            } else {
                per = per + i
                ipr = ipr + 1
            }
        }
        else{
            println("debe ser mayor a cero")
            break
        }
    }
    println("$pr son numeros pares y su sumatoria es $pa y $ipr son impares y su sumatoria es $per")

}