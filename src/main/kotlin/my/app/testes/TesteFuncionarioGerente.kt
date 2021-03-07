package my.app.testes

import my.app.Gerente

fun main() {
//    val fernando = Pessoa(nome = "Fernando Galvão", cpf = "123.456.789-12")
//    println("\tNome: ${fernando.nome}" +
//            "\n\tCPF: ${fernando.cpf}\n")


    val fernando = Gerente(nome = "Fernando Galvão", cpf = "147.258.369-14", salario = 3780.00)
//    println("\tNome: ${katia.nome}" +
//            "\n\tCPF: ${katia.cpf}")
    imprimeRelatorioFuncionario.imprime(fernando)
}
