fun main() {
    val colores = listOf("Azul", "Amarillo", "Rojo")
    //con with puedo acceder a las propiedades de la variable sin tener que llamar a la variable
    with(colores){
        println("Nuestros colores son $this")
        println("Esta lista tiene una cantidad de colores de $size")
    }
}