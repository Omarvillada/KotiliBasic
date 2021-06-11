fun main() {
    //Mapas inmutables
    val edadSuperHeroes = mapOf(
        "Ironman" to 35,
        "Spiderman" to 33,
        "Capitan America" to 99
    )
    println(edadSuperHeroes)

    //Mapas mutables

    val edadSuperHeroesMutables = mutableMapOf(
        "Ironman" to 35,
        "Spiderman" to 33,
        "Capitan America" to 99
    )

    edadSuperHeroesMutables.put("Wolverine",45)
    edadSuperHeroesMutables["Storm"] = 30
    println(edadSuperHeroesMutables)

    val edadIronman = edadSuperHeroesMutables["Ironman"]
    println(edadIronman)

    edadSuperHeroesMutables.remove("Wolverine")
    println(edadSuperHeroesMutables)

    println(edadSuperHeroesMutables.keys)
    println(edadSuperHeroesMutables.values)
}