fun main() {
    //variable nulla
    var nombre : String? = null
    nombre?.let {
            valor-> print("El nombre no es nulo, es $valor")
    }
    nombre = "Omar"
    nombre?.let {
            valor-> print("El nombre no es nulo, es $valor")
    }

}