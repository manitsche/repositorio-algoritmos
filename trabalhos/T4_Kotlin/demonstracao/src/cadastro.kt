
import java.io.File

data class Aluno(
    val nome: String,
    val matricula: String,
    val nota: Double
)

fun main() {
    print("Quantos alunos deseja cadastrar? ")
    val quantidade = readLine()?.toIntOrNull() ?: 0

    if (quantidade <= 0) {
        println("Quantidade inválida!")
        return
    }

    // Vetor de registros
    val alunos = Array(quantidade) {
        Aluno("", "", 0.0)
    }

    // Cadastro dos alunos
    for (i in alunos.indices) {
        println("\n===== ALUNO ${i + 1} =====")

        print("Nome: ")
        val nome = readLine()?.trim().orEmpty()

        print("Matrícula: ")
        val matricula = readLine()?.trim().orEmpty()

        print("Nota: ")
        val nota = lerNota()

        alunos[i] = Aluno(nome, matricula, nota)
    }

    // Gravação no arquivo
    val arquivo = File("alunos.txt")

    try {
        arquivo.bufferedWriter().use { escritor ->
            for (aluno in alunos) {
                escritor.write(
                    "${aluno.nome}|${aluno.matricula}|${aluno.nota}"
                )
                escritor.newLine()
            }
        }

        println("\nDados gravados no arquivo alunos.txt!")

        // Leitura do arquivo
        println("\n===== ALUNOS APROVADOS =====")

        val linhas = arquivo.readLines()
        var encontrou = false

        for (linha in linhas) {
            val dados = linha.split("|")

            if (dados.size == 3) {
                val nome = dados[0]
                val matricula = dados[1]
                val nota = dados[2].toDoubleOrNull()

                if (nota != null && nota >= 6.0) {
                    println("Nome: $nome")
                    println("Matrícula: $matricula")
                    println("Nota: ${"%.2f".format(nota)}")
                    println("-------------------------")
                    encontrou = true
                }
            }
        }

        if (!encontrou) {
            println("Nenhum aluno atingiu a nota mínima.")
        }

    } catch (erro: Exception) {
        println("Erro ao manipular o arquivo: ${erro.message}")
    }
}

fun lerNota(): Double {
    while (true) {
        val nota = readLine()
            ?.replace(',', '.')
            ?.toDoubleOrNull()

        if (nota != null && nota in 0.0..10.0) {
            return nota
        }

        print("Nota inválida. Digite um valor entre 0 e 10: ")
    }
}