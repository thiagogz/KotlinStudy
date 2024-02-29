// Exercício 1: Soma dos Elementos

fun main() {
    //Array de inteiros
    val numbers = intArrayOf(5, 10, 15, 20, 25) // imutável
    var sum = 0 // variável para armazenar a soma // mutável

    //Loop para somar os elementos do Array
    for (number in numbers) {
        sum += number
        println("Resultado: $sum")
    }

    println("A soma final dos elementos dentro do Array é de $sum")
}