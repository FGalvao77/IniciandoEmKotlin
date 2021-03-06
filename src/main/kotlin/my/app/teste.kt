package my.app

//meu primeiro código em Kotlin

val firstName:String = "Fernando"
val lastName:String  ="Galvão"
val bornYear:Int = 1977
var atualYear:Int = 2021
var age:Int = (atualYear - bornYear)
var occupation:String = "Student of Data Science"

fun main() {
    println("Seja bem-vindo ao KOTLIN S2!")
    println("Espero que sua experiência seja excelente ;) \n")
    println("\tNome: $firstName $lastName \n\tIdade: $age \n\tOcupação: $occupation")
}