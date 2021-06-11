fun main() {
    val moviles = mutableListOf("Google Glalaxy", "Samsung Pro","Iphone X","Google Pixel 2XL", "Google Pixel 4a")
        .run {
            removeIf { movil->movil.contains("Google")}
            this
        }
    print(moviles)
}