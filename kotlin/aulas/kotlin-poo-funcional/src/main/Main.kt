package main

import model.Product

fun main() {
    val products = createProducts()
    printProducts(products)

    printProductsByCategory("Video Games", products)
    printProductsByPrice(8000f, products)

    printProductsByDiscount(products) // Todos os produtos com desconto
    printProcuctsByCatedoryVideoGames(products) // Produtos na categoria Video Games
    printProcuctsByCatedoryComputers(products) // Produtos na categoria Computers
    printProcuctsByCatedorySmartphones(products) // Produtos na categoria Smartphones
    printProcuctsByCatedoryCameras(products) // Produtos na categoria Cameras

}

fun createProducts(): List<Product> {
    return listOf(
        Product(1, "Xbox", 2000f, "Video Games", 10f),
        Product(2, "Playstation", 2200f, "Video Games", 10f),
        Product(3, "Nintendo Switch", 1800f, "Video Games", 20f),
        Product(4, "Macbook Pro", 10000f, "Computers"),
        Product(5, "Dell XPS", 8000f, "Computers"),
        Product(6, "Lenovo Thinkpad", 7000f, "Computers"),
        Product(7, "Iphone 12", 8000f, "Smartphones", 10f),
        Product(8, "Samsung Galaxy S21", 7000f, "Smartphones", 10f),
        Product(9, "Oneplus 9", 6000f, "Smartphones", 20f),
        Product(10, "Canon EOS R5", 15000f, "Cameras"),
        Product(11, "Sony A7 III", 12000f, "Cameras"),
        Product(12, "Nikon Z6", 10000f, "Cameras")
    )
}

fun printProducts(products: List<Product>) {
    products.forEach { p ->
        println(p)
    }
}

fun printProductsByCategory(category: String, products: List<Product>) {
    println("Produtos na categoria $category")
    val result = products.filter { p ->
        p.category == category
    }
    printProducts(result)
}

fun printProductsByPrice(price: Float, products: List<Product>) {
    println("Produtos com preço menor que $price")
    val result = products.filter { p ->
        p.price >= price
    }
    printProducts(result)
}

fun printProductsByDiscount(products: List<Product>) {
    println("Todos os produtos com desconto")
    val result = products.filter { p ->
        p.discount > 0
    }
    printProducts(result)
}

fun printProcuctsByCatedoryVideoGames(products: List<Product>) {
    println("Produtos na categoria Video Games")
    val result = products.filter { p ->
        p.category == "Video Games"
    }
    printProducts(result)
}

fun printProcuctsByCatedoryComputers(products: List<Product>) {
    println("Produtos na categoria Computers")
    val result = products.filter { p ->
        p.category == "Computers"
    }
    printProducts(result)
}

fun printProcuctsByCatedorySmartphones(products: List<Product>) {
    println("Produtos na categoria Smartphones")
    val result = products.filter { p ->
        p.category == "Smartphones"
    }
    printProducts(result)
}

fun printProcuctsByCatedoryCameras(products: List<Product>) {
    println("Produtos na categoria Cameras")
    val result = products.filter { p ->
        p.category == "Cameras"
    }
    printProducts(result)
}
