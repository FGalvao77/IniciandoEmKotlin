package my.app

//data class é imutável
data class Banco(
    val nome:String,
    val numero:Int
) {
    fun Info() = "$nome $numero"
}
