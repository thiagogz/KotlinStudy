// Exercício - maior ou menor de idade

// fun main() {
//     val idade = 19

//     if (idade >= 18) {
//         println("Maior de idade")
//     } else {
//         println("Menor de idade")
//     }
// }

//========================================Recebendo Parâmetros do Usuário ========================================

fun main() {
    print("Digite a idade: ")
    val idadeInput = readLine()
    val idade = idadeInput?.toIntOrNull()

    if (idade == null) {
        println("Idade inválida")
        return
    } else if (idade >= 18) {
        println("Maior de idade")
    } else {
        println("Menor de idade")
    }
}