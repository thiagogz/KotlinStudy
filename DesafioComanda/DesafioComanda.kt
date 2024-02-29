// Desafio Comanda Lanchonete
fun main() {
    // Criação das variáveis
    var coxinha: Double = 5.00
    var cerveja: Double = 15.00
    var qtdCoxinha: Int = 3
    var qtdCerveja: Int = 2
    var somaCoxinha: Double = qtdCoxinha * coxinha
    var somaCerveja: Double = qtdCerveja * cerveja
    var somaTotal: Double = somaCoxinha + somaCerveja
    var taxa: Double = somaTotal * 0.10
    var totalFinal: Double = somaTotal + taxa

    println("--------------------------")
    println("\t.:   Lanchonete T   :.")
    println("--------------------------")
    println("$qtdCoxinha coxinhas\t\t R$ %.2f".format(somaCoxinha))
    println("$qtdCerveja cervejas\t\t R$ %.2f".format(somaCerveja))
    println("Somatoria\t\t R$ %.2f".format(somaTotal))
    println("--------------------------")
    println("Taxa 10%%\t\t R$  %.2f".format(taxa))
    println("--------------------------")
    println("Conta Final\t\t R$ %.2f".format(totalFinal))

}