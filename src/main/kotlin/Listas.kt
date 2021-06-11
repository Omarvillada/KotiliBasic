fun main() {
    //Lista inmutable
    val listaNombres = listOf<String>("Juan", "Enrique", "Camila")
    println(listaNombres)

    //Lista mutable
    val listaVacia = mutableListOf<String>()
    println(listaVacia)
    listaVacia.add("Omar")
    println(listaVacia)

    val usangoGet = listaVacia.get(0)
    println(usangoGet)
    val usandoOperador = listaVacia[0]
    println(usandoOperador)

    val primerValor: String? = listaNombres.firstOrNull()
    println(primerValor)

    listaVacia.removeAt(0)
    println(listaVacia)
    listaVacia.add("Lin")
    listaVacia.removeIf { caracteres->caracteres.length > 3 }
    println(listaVacia)

    val myArray = arrayOf(1,2,3,4,5)
    println("mi array $myArray")
    println("Array como lista ${myArray.toList()}")
}