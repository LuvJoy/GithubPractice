data class Card(
    val id: Int,
    val pattern: String,
    val number: String
) {
    fun isClover(): Boolean {
        return pattern == "Clover"
    }
}