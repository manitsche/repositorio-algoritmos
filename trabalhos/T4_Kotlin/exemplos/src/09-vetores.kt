
fun main() {

    // Declaração e inicialização
    val numeros = arrayOf(10, 20, 30, 40, 50)

    // Acesso por índice
    println("Primeiro elemento: ${numeros[0]}")
    println("Terceiro elemento: ${numeros[2]}")

    // Alteração de um elemento
    numeros[1] = 25

    // Percurso
    println("\nTodos os elementos:")

    for (i in numeros.indices) {
        println("Posição $i: ${numeros[i]}")
    }

    // Tamanho
    println("\nTamanho do vetor: ${numeros.size}")

    // Vetor dinâmico
    val lista = mutableListOf(10, 20, 30)

    lista.add(40)
    lista.add(50)

    println("Lista dinâmica: $lista")
    println("Tamanho da lista: ${lista.size}")
}