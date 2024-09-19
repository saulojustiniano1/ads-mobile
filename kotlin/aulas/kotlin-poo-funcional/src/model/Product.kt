package model

data class Product(
    val id: Int,
    val description: String,
    val price: Float = 0.0f,
    val category: String = "",
    val discount: Float = 0.0f
) {
    override fun toString(): String {
        if (discount > 0) {
            val discountedPrice = price * (1 - discount / 100)
            return "#: $id - $description (PROMOÇÃO) - R$$price - $category - $discount% - R$$discountedPrice"
        }
        return  "#: $id - $description - $price - $category - $discount%"
    }
}