
fun main() {

    // Chamada de função com retorno
    val resultado = somar(10, 5)
    println("Resultado da soma: $resultado")

    // Chamada de procedimento (Unit)
    apresentarMensagem("Bem-vindo ao Kotlin!")

    // Passagem de parâmetro por valor
    var numero = 10
    alterarNumero(numero)
    println("Valor original: $numero")

    // Modificação de objeto mutável
    val lista = mutableListOf(1, 2, 3)
    adicionarNumero(lista, 4)
    println("Lista modificada: $lista")

    // Escopo de variável
    val mensagem = "Variável local do main"
    println(mensagem)
}

// Função que recebe dois parâmetros e retorna um inteiro
fun somar(a: Int, b: Int): Int {
    return a + b
}

// Procedimento: retorna Unit
fun apresentarMensagem(texto: String) {
    println(texto)
}

// Recebe uma cópia do valor inteiro
fun alterarNumero(valor: Int) {
    var novoValor = valor
    novoValor = 50
    println("Valor dentro da função: $novoValor")
}

// Recebe uma referência ao objeto como valor
fun adicionarNumero(lista: MutableList<Int>, numero: Int) {
    lista.add(numero)
}