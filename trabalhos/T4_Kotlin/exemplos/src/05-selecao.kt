
fun main() {

    print("Digite sua idade: ")
    val idade = readLine()?.toIntOrNull() ?: 0

    // IF
    if (idade >= 18) {
        println("É maior de idade.")
    }

    // IF-ELSE
    if (idade >= 18) {
        println("Pode entrar.")
    } else {
        println("Não pode entrar.")
    }

    // SELEÇÃO ENCADEADA
    if (idade < 12) {
        println("Criança.")
    } else if (idade < 18) {
        println("Adolescente.")
    } else if (idade < 60) {
        println("Adulto.")
    } else {
        println("Idoso.")
    }

    // SELEÇÃO MÚLTIPLA: WHEN
    print("Digite um número de 1 a 3: ")
    val opcao = readLine()?.toIntOrNull() ?: 0

    when (opcao) {
        1 -> println("Você escolheu a opção 1.")
        2 -> println("Você escolheu a opção 2.")
        3 -> println("Você escolheu a opção 3.")
        else -> println("Opção inválida.")
    }
}