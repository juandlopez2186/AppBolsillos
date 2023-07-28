package com.juadlopez2186.appbolsillos

class retocarros {
}
fun main() {
    var coches= mutableListOf<String>()
    var op:String="si"
    do{
        println("Este es un sistema para trabajar con carros: añadir 1, mostrar 2, buscar 3, modificar 4, eliminar 5 y borrar la lista de carros 6")
        var opc:Int=readLine()!!.toInt()
        when(opc) {
            1 -> {
                println("Ingrese el carro que quiere registrar")
                var carro:String=readLine().toString()
                if (coches.contains(carro)==true){
                    println("Lo siento el carro ya existe")
                }else{
                    coches.add(carro)
                    println("Se registro el carro")
                }
            }
            2->{
                println("La lista de carros es: ")
                if (coches==emptyList<String>()){
                    println("no hay carrots")
                }
                for ((index,i) in coches.withIndex()){
                    var pos:Int=index+1
                    println("El carro $pos es $i")
                }
            }
            3->{
                println("Ingresa el carro que quieres buscar")
                var carro:String=readLine().toString()
                if (coches.contains(carro)==true){
                    var posi:Int=coches.indexOf(carro)
                    println("El carro fue encontrado, es $posi "+coches[posi])
                }else{
                    println("El carro no existe")
                }
            }
            4->{
                println("Ingresa la posición que quieres modificar")
                var pos:Int=readLine()!!.toInt()
                if(pos<coches.size) {
                    var carro:String=coches[pos]
                    println("El carro es $carro, ingresa por cuál quieres cambiarlo")
                    var ncarro:String=readLine().toString()
                    carro=ncarro
                    println("Se modifico")
                } else{
                    println("La posición no existe")
                }
            }
            5->{
                println("Ingresa la posición que quieres eliminar")
                var pos:Int=readLine()!!.toInt()
                if(pos<coches.size) {
                    var carro:String=coches[pos]
                    println("El carro $carro se eliminó")
                    coches.removeAt(pos)
                }else{
                    println("La posición no existe")
                }
            }
            6->{
                println("Seguro que quieres eliminarla? si o no")
                var opc:String=readLine().toString()
                if (opc=="si"){
                    coches.removeAll(coches)
                    println("Eliminada")
                }else{
                    println("Que susto, no se eliminó nada")
                }
            }
        }
        println("Quiere seguir usando el programa? si o no")
        op=readLine().toString()
    }while (op=="si")
}
