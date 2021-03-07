package my.app.testes

import my.app.Pessoa

fun main() {
    val fernando = Pessoa(nome = "Fernando Galvão", cpf = "123.456.789-12")

    //println(fernando.pessoaInfo())
    println("\tNome: ${fernando.nome}")
    println("\tCPF: ${fernando.cpf}")
}