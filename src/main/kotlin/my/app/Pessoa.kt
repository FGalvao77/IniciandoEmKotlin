package my.app

class Pessoa {
    var nome:String = "Fernando"
    var cpf:String = "123.456.789-xx"

    inner class Endereco {
        var rua:String = "Rua 28"
    }
}

fun main() {
    val fernando = Pessoa()

    println(fernando.nome)
    println(fernando.cpf)

    println(fernando.Endereco().rua)
}