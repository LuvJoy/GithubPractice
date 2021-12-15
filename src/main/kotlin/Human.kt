data class Human(
    var name: String,
    var id: Int,
    var age: Int
) {
    fun isOld(): Boolean {
        return age > 50
    }
    fun isYoung(): Boolean {
        return age < 40
    }
}