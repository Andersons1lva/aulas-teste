package one.digitalinnovation.digitalonebanck.testes

import one.digitalinnovation.digitalonebanck.Gerente


fun main() {
    val Anderson = Gerente(nome = "Anderson" , cpf = "333.526.369-15", salario = 5000.0)
    imprimeRelatorioFuncionario.imprime(Anderson)
}

