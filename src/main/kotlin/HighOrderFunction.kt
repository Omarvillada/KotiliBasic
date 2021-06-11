fun main(args:Array<String>){

    val largoDeValorInicial = superFunction(valorInicial = "Hola!")
    { valor -> valor.length }
    println(largoDeValorInicial)

    val lambda: () -> String = functionInception("Omar")
    val valorLambda: String = lambda()
    println(valorLambda)
}
//Block cuando vaya a ejecutar una lambda
fun superFunction(valorInicial : String, block : (String)->Int) : Int{
    return block(valorInicial)
}

fun functionInception(nombre : String) : ()-> String{
    return {
        "Hola desde la lambda $nombre"
    }
}