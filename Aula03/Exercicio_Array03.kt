// Exercício 03: Média dos elementos
fun main() {
    val values = doubleArrayOf(12.5, 9.8, 15.2, 18.7, 20.0) // Array de doubles
    var sum = 0.0 // Variável para armazenar a soma

    // Loop para somar os elementos de Array
    for (value in values) {
        sum += value
    }

    var average = sum / values.size // Cálculo da média
    println("A média é: $average") // Impressão da média
}