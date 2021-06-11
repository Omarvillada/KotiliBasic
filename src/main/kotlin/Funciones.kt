fun main() {
    val fraseAleatoria = "En platzi nunca paramos de aprender".randomCase()
    imprimirFrase(fraseAleatoria)
}
fun imprimirFrase(frase: String): Unit{
    print("Tu frase es $frase")
}

//Funcion de extension
fun String.randomCase():String{
    val numeroAleatorio = 0..99
    val resultadoAleatorio = numeroAleatorio.random()

    return if(resultadoAleatorio.rem(2) == 0){
        this.toUpperCase()
    }else{
        this.toLowerCase()
    }
}