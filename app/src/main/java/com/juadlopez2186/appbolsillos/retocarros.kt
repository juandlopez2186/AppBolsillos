package com.juadlopez2186.appbolsillos

class retocarros {
}

fun main() {
    var coche = mutableListOf("wolfwagen")
    var index = "sí"
    var continua = "sí"
    while (index == continua) {
        println("digite 1 para registrar un auto 2 para mostrar los autos registrados 3 para buscar si un auto ya esta registrado 4 para modificarlo 5 para eliminar un auto y 6 para eliminar todos los registros")
        var op = readLine()!!.toInt()
        when (op) {
            1 -> if (op==1) {
                println("digite un auto")
                var eleccion = readLine().toString()
                var conf = coche.contains(eleccion)
                if (conf) {
                    println("el coche $eleccion ya existe")
                } else {
                    println(coche)
                    var conf = coche.contains(eleccion)
                    if (conf) {
                        println("el coche $eleccion ya esta registrado")
                    } else {
                        println("el coche $eleccion no esta registrado")
                        coche.add(eleccion)
                        println("desea continuar")
                        continua = readLine().toString()
                    }
                }


                }
            2 -> if(op==2){
                println(coche)
            }
            3->if (op==3){

            }
            4->if (op==4){}
            5->if(op==5){}
            6->if (op==6){}
            }

        }
}