package one.digitalinnovation.digitalonebanck

class Analista (
    nome : String,
    cpf : String,
    salario : Double
) : Funcionario(nome,cpf, salario){
    override fun calculoauxilio() = salario * 0.1
}