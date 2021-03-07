package my.app.testes

import my.app.Funcionario
import my.app.Pessoa
import java.math.BigDecimal

fun main() {
    val fernando = Pessoa(nome = "Fernando Galvão", cpf = "123.456.789-12")
    println("\tNome: ${fernando.nome}" +
            "\n\tCPF: ${fernando.cpf}\n")


    val katia = Funcionario(nome = "Kátia Galvão", cpf = "147.258.369-14", BigDecimal.valueOf(1800))
    println("\tNome: ${katia.nome}" +
            "\n\tCPF: ${katia.cpf}")
}