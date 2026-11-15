
fun main() {

    // WHILE: teste no início
    println("===== WHILE =====")

    var contador = 1

    while (contador <= 5) {
        println("Número: $contador")
        contador++
    }

    // DO-WHILE: teste no final
    println("\n===== DO-WHILE =====")

    var numero = 1

    do {
        println("Número: $numero")
        numero++
    } while (numero <= 5)

    // FOR: repetição com contador
    println("\n===== FOR =====")

    for (i in 1..5) {
        println("Número: $i")
    }
}