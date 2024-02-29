// Exemplo de variável em Kotlin

// fun main() {
//     val nome = "Thiago" //variavel tipo string -- não pode ser alterada (não mutável)
//     var inicial = nome[0] //variável tipo char
//     var idade = 27 //variável tipo int         -- pode ser alterada (mutável)
//     println("Nome: $nome, Idade: $idade")
// }

//int, double, string, boolean - mais utilizadas

// fun main() {
//     val numeroInteiro: Int = 10 
//     var numeroDecimal: Double = 10.0
//     val texto: String = "Olá, mundo!"
//     var status: Boolean = true

//     println("Número inteiro: $numeroInteiro")
//     println("Número decimal: $numeroDecimal")
//     println("Texto: $texto")
//     println("Status: $status")

// }

//variaveis com tipo de dados
//char, byte, short, long

// fun main() {
//     val numeroInteiro: Int = 10
//     val numeroLong: Long = 1000000000000000000 
//     var numeroDecimal: Double = 10.0
//     val caractere: Char = 'T'
//     val texto: String = "Kotlin tbm serve para back-end"
//     var status: Boolean = true

//     println("Número inteiro: $numeroInteiro")
//     println("Número long: $numeroLong")
//     println("Número decimal: $numeroDecimal")
//     println("Caractere: $caractere")
//     println("Texto: $texto")
//     println("Status: $status")

// }

// fun main() {
//     var mutavel: Int = 10
//     val imutavel: Int = 15 

//     println("Mutavel: $mutavel")
//     println("Imutavel: $imutavel")

//     mutavel = 25
//     //imutavel = 20 // Erro! Não pode atribuir um valor a uma variável declarada como imutável

//     println("Mutavel: $mutavel")
//     println("Imutavel: $imutavel")

//     val nome: String = "Thiago" //variavel tipo string -- não pode ser alterada (não mutável)
//     val inicial: Char = nome[0] //variável tipo char

//     println("Nome: $nome, Inicial: $inicial")
// }

fun main() {
    val nome = "Alice"

    if (true) {
        val sobrenome = "Silva"
        println("Nome completo: $nome $sobrenome")
    } else {
        val sobrenome = "Santos"
        println("Nome completo: $nome $sobrenome")	
    }
}