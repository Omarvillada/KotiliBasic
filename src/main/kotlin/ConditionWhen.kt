fun main(args: Array<String>){
    val color = "Carmesí"

    when(color){
        "Amarillo"-> println("El amarillo es el color de la alegría")
        "Rojo", "Carmesí"-> println("EL rojo es el color del amor")
        else -> println("Error, no tengo información del color")
    }
    val codigo = 400
    when(codigo){
        in 200..299-> println("Todo ha ido bien")
        in 400..500-> println("Algo ha fallado")
        else -> println("Codigo desconocido, algo ha fallado")
    }

    val tallaZapatos = 41
    val mensaje = when(tallaZapatos){
        41,43->"Tenemos talla disponible"
        42,44->"Casi no nos quedan"
        45->"Lo siento, no tenemos disponible"
        else->"Estos zapatos solo vienen en tallas 41,43,42,44 y 45"
    }
    println(mensaje)
}