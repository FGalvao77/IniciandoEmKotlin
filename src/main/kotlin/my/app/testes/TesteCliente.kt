package my.app.testes

import my.app.Cliente
import my.app.ClienteTipo

fun main() {
    val sara = Cliente(
        nome = "Sara Galvão",
        cpf = "159.357.852-25",
        clienteTipo = ClienteTipo.PF,
        senha = "123456"
    )
    println(sara)

    TesteAutenticacao().autentica(sara)
}