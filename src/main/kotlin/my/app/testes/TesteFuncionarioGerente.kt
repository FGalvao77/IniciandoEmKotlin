package my.app.testes

import my.app.Gerente

fun main() {
//    val fernando = Pessoa(nome = "Fernando Galvão", cpf = "123.456.789-12")
//    println("\tNome: ${fernando.nome}" +
//            "\n\tCPF: ${fernando.cpf}\n")

//    val katia = Pessoa(nome = "Kátia Galvão", cpf = "123.456.789-12")
//    println("\tNome: ${katia.nome}" +
//            "\n\tCPF: ${katia.cpf}\n")

    val fernando = Gerente(nome = "Fernando Galvão",
                           cpf = "147.258.369-14",
                           salario = 3780.00,
                           senha = "senha123")

    imprimeRelatorioFuncionario.imprime(fernando)

    TesteAutenticacao().autentica(fernando)
}
