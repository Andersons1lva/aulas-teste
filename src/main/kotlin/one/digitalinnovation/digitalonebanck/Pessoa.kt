package one.digitalinnovation.digitalonebanck

class Pessoa {
    var nome: String = " Anderson"
    var cpf: String = "111.552.996-15"
    private set

    constructor()

    fun pessoaInfo() = "$nome e $cpf"


}

fun main(){
    val Anderson = Pessoa()

    println(Anderson.pessoaInfo())

}