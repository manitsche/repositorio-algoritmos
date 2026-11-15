
fun main() {

    val a = 10
    val b = 5

    // Operadores aritméticos
    println("Soma: ${a + b}")
    println("Subtração: ${a - b}")
    println("Multiplicação: ${a * b}")
    println("Divisão: ${a / b}")
    println("Resto: ${a % b}")

    // Operadores relacionais
    println("A é maior que B? ${a > b}")
    println("A é igual a B? ${a == b}")
    println("A é diferente de B? ${a != b}")

    // Operadores lógicos
    println("As duas condições são verdadeiras? ${a > 0 && b > 0}")
    println("Pelo menos uma é verdadeira? ${a > 0 || b < 0}")
    println("Negação: ${!(a > b)}")

    // Operadores de atribuição
    var numero = 10

    numero += 5
    println("Após += 5: $numero")

    numero -= 3
    println("Após -= 3: $numero")

    numero *= 2
    println("Após *= 2: $numero")

    numero /= 4
    println("Após /= 4: $numero")

    // Precedência
    val resultado1 = 2 + 3 * 4
    val resultado2 = (2 + 3) * 4

    println("Sem parênteses: $resultado1")
    println("Com parênteses: $resultado2")
}