package my.app.testes

import my.app.Banco

fun main() {
    val digitalBank = Banco(nome = "ESKF Bank", numero = 1521)

    println("\tNome: ${digitalBank.nome} \n\tNúmero: ${digitalBank.numero}")
    println("\n")

    println(digitalBank.nome)
    println(digitalBank.numero)

    val bank2 = digitalBank.copy(nome = "SE Bank", numero = 1321) //criando uma cópia do objeto e instaciando um novo objeto

    println(bank2.Info())
    //println(bank2.nome)
    //println(bank2.numero)
}