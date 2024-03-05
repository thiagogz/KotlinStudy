fun main() {
    var opcao: Char

    println("O que você deseja comprar?")

    do {
        println("1 - iPhone")
        println("2 - iPad")
        println("3 - Mac")
        println("4 - iMac")
        println("5 - Sair")
        print("Digite a opção desejada: ")
        opcao = readLine()!!.first()

        when (opcao) {
            '1' -> println("Você escolheu o iPhone")
            '2' -> println("Você escolheu o iPad")
            '3' -> println("Você escolheu o Mac")
            '4' -> println("Você escolheu o iMac")
            '5' -> println("Você saiu do menu")
            else -> println("Opção inválida. Tente novamente.")
        }
    } while (opcao != '5')
}