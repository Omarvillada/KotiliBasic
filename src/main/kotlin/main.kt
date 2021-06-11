const val PI = 3.1416
fun main(args: Array<String>) {
    val nombre = "Lee"
    if(nombre.isNotEmpty()) println("El largo de nuestra variable es ${nombre.length}") else println("Error, la variable esta vacia")

    val mensaje : String = if(nombre.length > 4){
        "Tu nombre es largo"
    }else if(nombre.isEmpty()){
        "Tu nombre esta vacío"
    }else{
        "Tienes un nombre corto"
    }
    println(mensaje)
}