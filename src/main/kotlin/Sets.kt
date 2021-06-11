fun main() {
    //Los sets a diferencia de las listas no pueden tener elementos repetidos
    //inmutables
    val vocales = setOf("a","e","i","o","u","a","e","i","o","u")
    println(vocales)

    val numerosFavoritos = mutableSetOf(1,2,3,4)
    println(numerosFavoritos)
    numerosFavoritos.add(5)
    numerosFavoritos.add(5)
    println(numerosFavoritos)
    numerosFavoritos.remove(5)
    println(numerosFavoritos)

    val numeroSet: Int? = numerosFavoritos.firstOrNull { numero-> numero > 2 }
    println(numeroSet)

}