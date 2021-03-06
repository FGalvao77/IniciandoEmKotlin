package my.app

class Pessoa {
    var nome:String = "Fernando"
    var cpf:String = "123.456.789-xx"
    private set

    constructor()
    fun pessoaInfo() = "\tNome: $nome \n\tCPF: $cpf"

}

fun main() {
    val fernando = Pessoa()

    println(fernando.pessoaInfo())
    //println(fernando.nome)
    //println(fernando.cpf)
}