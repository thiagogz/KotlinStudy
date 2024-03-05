fun main () {
    val numeros = 10
    var soma = 0

    for (i in 1..numeros) {
        soma += i
    }

    println("A soma dos números naturais de 1 a $numeros é $soma")
}