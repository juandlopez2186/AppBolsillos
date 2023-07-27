package com.juadlopez2186.appbolsillos

class percir {

}
fun per () {
    println("digite el diametro")
    var d= readLine()!!.toDouble()
    var rest=3.1416*d
    println("el perimetro es de $rest")
}
fun area(){
    println("digite el radio")
    var r= readLine()!!.toDouble()
    var rest=(3.1416*r)*r
    println("el area es de $rest")
}
fun maint(){
    var op= 0
    while (op==0){
        println("digite 1 si desea conseguir el perimetro del circlo o 2 para el area ")
        var opt= readLine()!!.toInt()
        if (opt==1){
            per()
        }
        else{
            area()
        }
        println("desea continuar el programa 0.si 1.no")
        op= readLine()!!.toInt()
        if (op==1){
            op=2
        }
    }
}
fun per1 (l1:Double,l2:Double,l3:Double) {
    var rest=l1+l2+l3
    println("el perimetro es de $rest")
    if (l1==l2 && l2==l3 && l3==l1){
        println("es equilatero")
    }
    else if (l1!=l2 && l2!=l3 && l1!=l3){
        println(" es escaleno")
    }
    else{
        println("es isoceles")
    }

}
fun area1(b:Float,a:Float){
    var rest=(b*a)/2
    println("el area es de $rest")
}
fun menu() {
    var op = 0
    while (op == 0) {
        println("digite 1 si desea conseguir el perimetro del triangulo o 2 para el area ")
        var opt = readLine()!!.toInt()
        if (opt == 1) {
            println("digite el primer lado")
            var l1= readLine()!!.toDouble()
            println("digite el segundo lado")
            var l2= readLine()!!.toDouble()
            println("digite el tercer lado")
            var l3= readLine()!!.toDouble()
            per1(l1,l2,l3)
        } else {
            println("digite la base")
            var b= readLine()!!.toFloat()
            println("digite la altura")
            var a= readLine()!!.toFloat()
            area1(a,b)
        }
        println("desea continuar el programa 0.si 1.no")
        op = readLine()!!.toInt()
        if (op == 1) {
            op = 2
        }
    }
    }
fun per2(l1: Double,l2: Double): Double  {
    var rest=(l1*l1)+(l2*l2)
    println("el perimetro es de $rest")
    return rest
}
fun area2(a: Double, b:Double): Double {
    var rest=a*b
    println("el area es de $rest")
    return rest
}
fun cubic() {
    var op = 0
    while (op == 0) {
        println("digite 1 si desea conseguir el perimetro del rectangulo o 2 para el area ")
        var opt = readLine()!!.toInt()
        if (opt == 1) {
            println("digite un lado")
            var l1= readLine()!!.toDouble()
            println("digite la base")
            var l2= readLine()!!.toDouble()
            per2(l1,l2)
        } else {
            println("digite un lado ")
            var a= readLine()!!.toDouble()
            println("digite la base")
            var b= readLine()!!.toDouble()
            area2(a,b)
        }
        println("desea continuar el programa 0.si 1.no")
        op = readLine()!!.toInt()
        if (op == 1) {
            op = 2
        }
    }
}
fun main() {
    var op = 0
    while (op == 0) {
        println("digite 1 para circulo, 2 para el triangulo, 3 para rectangulo")
        var opt = readLine()!!.toInt()
        when(opt){
        1-> maint()
        2-> menu()
        3-> cubic()
        }
        println("desea continuar el programa 0.si 1.no")
        op = readLine()!!.toInt()
        if (op == 1) {
            op = 2
        }
}
}

