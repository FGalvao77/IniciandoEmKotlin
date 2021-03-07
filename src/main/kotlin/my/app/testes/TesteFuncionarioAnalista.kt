package my.app.testes

import my.app.Analista

fun main() {
//    val fernando = Pessoa(nome = "Fernando Galvão", cpf = "123.456.789-12")
//    println("\tNome: ${fernando.nome}" +
//            "\n\tCPF: ${fernando.cpf}\n")


    val katia = Analista(nome = "Kátia Galvão", cpf = "147.258.369-14", salario = 2500.00)
//    println("\tNome: ${katia.nome}" +
//            "\n\tCPF: ${katia.cpf}")
    imprimeRelatorioFuncionario.imprime(katia)
}


//fun imprimeRelatorio(funcionario: Funcionario) = println(funcionario.toString())