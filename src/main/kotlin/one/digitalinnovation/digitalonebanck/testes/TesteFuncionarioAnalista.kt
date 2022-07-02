package one.digitalinnovation.digitalonebanck.testes

import one.digitalinnovation.digitalonebanck.Analista


fun main() {
    val Aline = Analista(nome = "Aline" , cpf = "333.333.333-11", salario = 2000.0)
    imprimeRelatorioFuncionario.imprime(Aline)
}