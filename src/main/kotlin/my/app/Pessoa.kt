package my.app

class Pessoa {
    var nome:String = "Fernando"
    var cpf:String = "123.456.789-xx"
}

fun main() {
    val fernando = Pessoa()
    println(fernando.nome)
    println(fernando.cpf)
}