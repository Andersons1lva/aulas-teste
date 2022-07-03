package one.digitalinnovation.digitalonebanck.testes

import one.digitalinnovation.digitalonebanck.Gerente
import one.digitalinnovation.digitalonebanck.TesteAutenticacao


fun main() {
    val Anderson = Gerente(nome = "Anderson" , cpf = "333.526.369-15", salario = 5000.0, senha = "senha123")
    imprimeRelatorioFuncionario.imprime(Anderson)

    TesteAutenticacao().autentica(Anderson)
}

