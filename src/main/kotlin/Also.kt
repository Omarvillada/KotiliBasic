fun main() {
    val moviles = mutableListOf("Samsung A50","Samsung A51","Samsung A52").also {
        lista -> print("El valor original de la lista es $lista")
    }.asReversed()
    print(moviles)

}
