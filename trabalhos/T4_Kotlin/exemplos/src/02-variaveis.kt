
fun main() {

    // =====================================
    // SEGURANÇA CONTRA VALORES NULOS
    // =====================================

    // Variável que NÃO aceita valor nulo
    var nome: String = "Carlos"

    // A linha abaixo causaria erro de compilação:
    // nome = null

    // Variável que ACEITA valor nulo
    var sobrenome: String? = "Silva"

    // Agora é permitido atribuir null
    sobrenome = null

    println("Nome: $nome")
    println("Sobrenome: $sobrenome")

    // =====================================
    // OPERADOR DE ACESSO SEGURO (?.)
    // =====================================

    val tamanho = sobrenome?.length

    println("Tamanho do sobrenome: $tamanho")

    // =====================================
    // OPERADOR ELVIS (?:)
    // =====================================

    val resultado = sobrenome ?: "Não informado"

    println("Sobrenome cadastrado: $resultado")

    // =====================================
    // VERIFICAÇÃO COM IF
    // =====================================

    if (sobrenome != null) {
        println("Sobrenome: ${sobrenome.length} caracteres")
    } else {
        println("O sobrenome não foi informado.")
    }

    // =====================================
    // OPERADOR !! (EVITAR SEM NECESSIDADE)
    // =====================================

    // Se sobrenome for null, ocorrerá
    // uma NullPointerException.
    // println(sobrenome!!.length)
}
