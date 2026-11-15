
fun main() {

    // Declaração
    val nome = "Kotlin"
    val linguagem = "Programação"

    // Concatenação
    val frase = linguagem + " em " + nome

    println("Frase: $frase")

    // Comparação
    val palavra = "kotlin"

    if (nome.equals(palavra, ignoreCase = true)) {
        println("As palavras são iguais.")
    } else {
        println("As palavras são diferentes.")
    }

    // Principais operações
    println("Quantidade de caracteres: ${nome.length}")
    println("Maiúsculas: ${nome.uppercase()}")
    println("Minúsculas: ${nome.lowercase()}")
    println("Primeiro caractere: ${nome.first()}")
    println("Último caractere: ${nome.last()}")
    println("Substituição: ${nome.replace("K", "C")}")
    println("Contém 't'? ${nome.contains("t")}")
    println("Parte do texto: ${nome.substring(0, 3)}")
}
