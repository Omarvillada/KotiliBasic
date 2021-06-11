fun main() {
    val numerosDeLoteria = listOf<Int>(4,33,12,42,27,16)
    println("Orden inicial $numerosDeLoteria")
    val numerosSort = numerosDeLoteria.sorted();
    println("Orden sort $numerosSort")

    val numerosDeLoteriaDecendentes = numerosDeLoteria.sortedDescending()
    println("Orden decendiente $numerosDeLoteriaDecendentes")

    val ordenarPorMultiplos = numerosDeLoteria.sortedBy { numero-> numero < 50 }
    println("Orden condicionado $ordenarPorMultiplos")

    val numerosAleatorios = numerosDeLoteria.shuffled()
    println("Orden aleatorio $numerosAleatorios")

    val numerosReversa = numerosDeLoteria.reversed()
    println("Orden en reversa $numerosReversa")

    val mensajesDeNumeros = numerosDeLoteria.map { numero-> "Tu numero de loteria es $numero" }
    println(mensajesDeNumeros)

    val numerosFiltrados = numerosDeLoteria.filter { numero->numero >  20 }
    println("Numeros filtrados $numerosFiltrados")

}