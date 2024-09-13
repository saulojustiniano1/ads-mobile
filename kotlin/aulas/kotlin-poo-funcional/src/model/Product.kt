package model

data class Product(
    val id: Int,
    val description: String,
    val price: Float = 0.0f,
    val category: String = ""
) {
    override fun toString(): String {
        return  "#: $id - $description - $price - $category"
    }
}