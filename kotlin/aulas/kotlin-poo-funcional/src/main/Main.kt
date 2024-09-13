package main

import model.Product

fun main() {
    val products = createProducts()
    printProducts(products)

    printProductsByCategory("Video Games", products)
    printProductsByPrice(8000f, products)
}

fun createProducts(): List<Product> {
    return listOf(
        Product(1, "Xbox", 2000f, "Video Games"),
        Product(2, "Playstation", 2200f, "Video Games"),
        Product(3, "Nintendo Switch", 1800f, "Video Games"),
        Product(4, "Macbook Pro", 10000f, "Computers"),
        Product(5, "Dell XPS", 8000f, "Computers"),
        Product(6, "Lenovo Thinkpad", 7000f, "Computers"),
        Product(7, "Iphone 12", 8000f, "Smartphones"),
        Product(8, "Samsung Galaxy S21", 7000f, "Smartphones"),
        Product(9, "Oneplus 9", 6000f, "Smartphones"),
        Product(10, "Canon EOS R5", 15000f, "Cameras"),
    )
}

fun printProducts(products: List<Product>) {
    products.forEach { p ->
        println(p)
    }
}

fun printProductsByCategory(category: String, products: List<Product>) {
    println("Products in category $category")
    val result = products.filter { p ->
        p.category == category
    }
    printProducts(result)
}

fun printProductsByPrice(price: Float, products: List<Product>) {
    println("Products with price less than $price")
    val result = products.filter { p ->
        p.price >= price
    }
    printProducts(result)
}