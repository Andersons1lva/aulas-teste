package one.digitalinnovation.digitalonebanck.testes

import one.digitalinnovation.digitalonebanck.Funcionario

class imprimeRelatorioFuncionario {

    companion object{
        fun imprime(funcionario: Funcionario){
            println(
                funcionario.toString()
            )
        }
    }
}