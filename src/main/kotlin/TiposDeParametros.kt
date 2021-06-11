fun main() {
    imprimirnombre(nombre = "Omar",apodo="", apellido = "Villada")
}
fun imprimirnombre(nombre : String, apodo:String = "Pocalucha", apellido : String){
    print("Mi nombre es $nombre $apellido y mi apodo $apodo")
}