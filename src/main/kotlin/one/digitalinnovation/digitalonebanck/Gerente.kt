package one.digitalinnovation.digitalonebanck

class Gerente(
    nome: String,
    cpf: String,
    salario: Double,
    val senha:String
) : Funcionario(nome = nome, cpf = cpf, salario = salario), Logavel {
    override fun calculoauxilio(): Double = salario * 0.4
    override fun login(): Boolean = "senha123" == senha
}