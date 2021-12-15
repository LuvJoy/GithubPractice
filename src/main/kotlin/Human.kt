data class Human(
    var name: String,
    var id: Int,
    var age: Int
) {
    fun isYoung(): Boolean {
        return age < 40
    }
}