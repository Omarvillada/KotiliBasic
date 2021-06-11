fun main(args: Array<String>){
    val listaDeFrutas = listOf("Manzana","Pera","Frambuesa","Durazno")
    for(fruta in listaDeFrutas) println("Hoy voy a comerme una fruta llamada $fruta")

    listaDeFrutas.forEach { fruta->println("Hoy voy a comerme una fruta nueva $fruta") }

    val caracteresDeFrutas: List<Int> = listaDeFrutas.map{ fruta->fruta.length}
    print(caracteresDeFrutas)

    val listFiltrate = caracteresDeFrutas.filter { largoDeFruit->largoDeFruit > 5}
    print(listFiltrate)
}