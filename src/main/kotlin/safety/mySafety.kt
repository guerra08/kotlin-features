package safety

fun main() {
    // Nullability is very important in Kotlin
    var first: String = "ABC" // This cant be null
    var second: String? = "DEF"; // This can be null

    // The Elvis operator can be helpful
    second = null;
    val size: Int = second?.length ?: -1; // If second is null, then size will be -1, otherwise, it will be second.length
    print(size)
}
