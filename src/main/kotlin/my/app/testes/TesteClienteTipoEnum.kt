package my.app.testes

import my.app.ClienteTipo

fun main() {
    ClienteTipo.values().forEach{ elemento ->
        println("\t${elemento.name} ----> $elemento")
    }

    ClienteTipo.values().forEach {
        println("\t${it.name} ---->" +
                " $it")
    }

}