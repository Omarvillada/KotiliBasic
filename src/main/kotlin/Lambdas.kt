fun main() {
    val myLambda : (String)-> Int = {valor->valor.length}
    val lambdaEjecutada: Int = myLambda("Que se dice mi so!")
    println(lambdaEjecutada)


    val saludos = listOf("Hello", "Hola", "nea")
    val lengthSaludos = saludos.map(myLambda)
    println(lengthSaludos)

   // val suma : (Int,Int)-> Int = {x:Int,y:Int-> x + y}

    val lambda : (Int)->Int ={valor->valor*valor}



}