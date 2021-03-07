package my.app

class Gerente(nome: String,
              cpf: String,
              salario: Double,
              val senha: String
): Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel {
    override fun calculoAuxilio(): Double = salario * 0.18

    override fun login(): Boolean = "senha123" == senha
}