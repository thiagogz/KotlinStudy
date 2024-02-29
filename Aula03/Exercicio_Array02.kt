// Exercicio 2: Maior e Menor Elemento

fun main() {
    val numbers = intArrayOf(8, 3, 12, 6, 20)
    var maxNumber = numbers[0] // variável para armazenar o maior elemento
    var minNumber = numbers[0] // variável para armazenar o menor elemento

    //Loop para encontrar o menor e o maior elemento

    for (number in numbers) {
        if (number < minNumber) {
            minNumber = number
        } 
        if (number > maxNumber) {
            maxNumber = number
        }
    }

    println("O menor elemento é: $minNumber")
    println("O maior elemento é: $maxNumber")
}