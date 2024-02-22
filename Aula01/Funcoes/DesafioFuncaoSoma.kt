//Desafio soma de dois quadrados

fun somaQuadrados(a: Int, b: Int): Int {
    var quadradoA = a * a
    var quadradoB = b * b
    return quadradoA + quadradoB
}

fun main() {
    var a=3
    var b=4
    var resultado = somaQuadrados(a, b)
    println("A soma dos quadrados de $a e $b é $resultado")
}