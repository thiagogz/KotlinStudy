// Exercício de verificação de acesso

fun main() {
    val usuario = "thiago" // Usuário pré-definido
    val senha = "senha123" // Senha pré-definida

    println("Digite o usuário: ") // Solicitando usuário
    val usuarioInput = readLine() // Recebendo usuário do teclado
    println("Digite a senha: ") // Solicitando senha
    val senhaInput = readLine() // Recebendo senha do teclado

    // Verificação de usuário e senha
    if (usuario == usuarioInput && senha == senhaInput) {
        println("Acesso permitido") // se usuário e senha estiverem corretos
    } else {
        println("Acesso negado") // se usuário e senha estiverem incorretos
    }
}