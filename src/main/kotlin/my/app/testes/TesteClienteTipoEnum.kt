package my.app.testes

import my.app.ClienteTipo

fun main() {
    ClienteTipo.values().forEach{ elemento ->
        println("\t${elemento.name} ----> ${elemento.descricao}")
    }

    ClienteTipo.values().forEach {
        println("\t${it.name} ---->" +
                " ${it.descricao}")
    }

    val PF = ClienteTipo.PF
    println("----> ${PF.name}: ${PF.descricao}")

    val PJ = ClienteTipo.PJ
    println("----> ${PJ.name}: ${PJ.descricao}")

}