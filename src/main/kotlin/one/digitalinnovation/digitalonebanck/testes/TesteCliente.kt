package one.digitalinnovation.digitalonebanck.testes

import one.digitalinnovation.digitalonebanck.Cliente
import one.digitalinnovation.digitalonebanck.ClienteTipo
import one.digitalinnovation.digitalonebanck.TesteAutenticacao

fun main() {
    val bryan = Cliente(
        nome = "Bryan Silva",
        cpf = "123.654.987-02",
        clienteTipo = ClienteTipo.PF ,
        senha = "123456"
    )
    println(bryan)
    TesteAutenticacao().autentica(bryan)
}
