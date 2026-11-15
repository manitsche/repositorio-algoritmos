
fun main() {

    print("Digite seu nome: ")
    val nome = readLine() ?: ""

    print("Digite sua idade: ")
    val idade = readLine()?.toIntOrNull() ?: 0

    print("Digite seu salário: ")
    val salario = readLine()
        ?.replace(',', '.')
        ?.toDoubleOrNull() ?: 0.0

    println("\n===== DADOS INFORMADOS =====")
    println("Nome: $nome")
    println("Idade: $idade anos")
    println("Salário: R$ ${"%.2f".format(salario)}")
}