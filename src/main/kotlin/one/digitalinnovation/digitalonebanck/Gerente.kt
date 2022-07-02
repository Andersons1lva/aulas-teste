package one.digitalinnovation.digitalonebanck

class Gerente(
    nome: String,
    cpf: String,
    salario: Double
) : Funcionario(nome = nome, cpf = cpf, salario = salario) {
    override fun calculoauxilio(): Double = salario * 0.4
}