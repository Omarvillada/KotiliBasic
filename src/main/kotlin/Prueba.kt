fun main() {

    val set = setOf("a","b","c")

    val animales = mutableMapOf("RazaDePerro" to "Corgi")
    animales.put("RazaDePerro","Pitbull")
    print(animales)

    print(miFuncion("Omar","Villada"))
}

fun miFuncion( nombre: String,  apellido: String) = nombre + apellido