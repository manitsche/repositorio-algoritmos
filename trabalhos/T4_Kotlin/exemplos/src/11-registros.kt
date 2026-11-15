
data class Funcionario(
    val nome: String,
    val idade: Int,
    val salario: Double,
    val ativo: Boolean
)

fun main() {

    // Criação de um registro
    val funcionario = Funcionario(
        nome = "Carlos",
        idade = 30,
        salario = 3500.00,
        ativo = true
    )

    // Acesso aos campos
    println("Nome: ${funcionario.nome}")
    println("Idade: ${funcionario.idade}")
    println("Salário: R$ ${"%.2f".format(funcionario.salario)}")
    println("Ativo: ${funcionario.ativo}")

    // Cópia com alteração de um campo
    val novoFuncionario = funcionario.copy(idade = 31)

    println("\nFuncionário atualizado:")
    println(novoFuncionario)
}