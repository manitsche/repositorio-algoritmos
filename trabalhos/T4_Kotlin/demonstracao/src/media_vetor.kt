fun main() {
    print("Quantos números deseja informar? ")
    val n = readLine()?.toIntOrNull() ?: 0

    if (n <= 0) {
        println("Quantidade inválida!")
        return
    }

    val numeros = DoubleArray(n)

    for (i in 0 until n) {
        print("Digite o ${i + 1}º número: ")
        numeros[i] = readLine()
            ?.replace(',', '.')
            ?.toDoubleOrNull() ?: 0.0
    }

    val media = numeros.average()
    val maior = numeros.maxOrNull()!!
    val menor = numeros.minOrNull()!!

    println("\n===== RESULTADOS =====")
    println("Média: ${"%.2f".format(media)}")
    println("Maior valor: $maior")
    println("Menor valor: $menor")

    println("Valores acima da média:")
    for (numero in numeros) {
        if (numero > media) {
            println(numero)
        }
    }
}