fun main(args: Array<String>){
    var contador = 10
    while (contador > 0){
        println("el valor del contador es $contador")
        contador--
    }

    do {
        println("Generando número aleatorio...")
        val numeroAleatorio = (0..100).random()
        println("EL numero generado es $numeroAleatorio")
    }while (numeroAleatorio > 50)
}