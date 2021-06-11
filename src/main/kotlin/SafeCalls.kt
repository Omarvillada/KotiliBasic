fun main(args: Array<String>){
    var nombre :String? = null
    try{
        throw   NullPointerException("Referencia nula")
    }catch (excepcion : NullPointerException){
        println("Ha ocurrido un error")
    } finally {
        println("Ha ocurrido un error... Cerrando Aplicacion")
    }

    val primerValor = 10
    val segundoValor = 0
    val resultado : Int = try {
        primerValor / segundoValor
    }catch (execpcion : Exception){0}

    println(resultado)
}