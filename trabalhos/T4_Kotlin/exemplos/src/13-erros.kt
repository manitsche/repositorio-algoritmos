
fun main() {

    try {

        print("Digite o primeiro número: ")
        val numero1 = readLine()?.toDoubleOrNull()
            ?: throw IllegalArgumentException("Número inválido.")

        print("Digite o segundo número: ")
        val numero2 = readLine()?.toDoubleOrNull()
            ?: throw IllegalArgumentException("Número inválido.")

        if (numero2 == 0.0) {
            throw ArithmeticException("Não é possível dividir por zero.")
        }

        val resultado = numero1 / numero2

        println("Resultado: $resultado")

    } catch (erro: ArithmeticException) {

        println("Erro matemático: ${erro.message}")

    } catch (erro: IllegalArgumentException) {

        println("Erro de entrada: ${erro.message}")

    } catch (erro: Exception) {

        println("Erro inesperado: ${erro.message}")

    } finally {

        println("Operação finalizada.")
    }
}
