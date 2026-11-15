
import java.io.File

fun main() {

    val arquivo = File("dados.txt")

    try {

        // Escrita no arquivo
        arquivo.writeText("Primeira linha do arquivo.\n")
        arquivo.appendText("Segunda linha do arquivo.\n")
        arquivo.appendText("Terceira linha do arquivo.\n")

        println("Arquivo gravado com sucesso!")

        // Leitura completa
        println("\n===== CONTEÚDO DO ARQUIVO =====")
        println(arquivo.readText())

        // Leitura linha por linha
        println("===== LEITURA POR LINHAS =====")

        arquivo.forEachLine { linha ->
            println(linha)
        }

    } catch (erro: Exception) {

        println("Erro ao manipular o arquivo.")
        println("Detalhes: ${erro.message}")
    }
}
