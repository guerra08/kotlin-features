package functional

fun applyToList (values: List<Int>, method: (v: Int) -> Int): List<Int>{
    return values.map { method(it) }
}

/**
 * The usage of inline does not instantiate the lambda method.
 */
inline fun applyToListInline (values: List<String>, method: (v: String) -> String): List<String>{
    return values.map { method(it) }
}

fun main(args: Array<String>){
    println(applyToList(listOf(1,2,3,4,5)) { number: Int -> (number * 2) + 5 })
    println(applyToListInline(listOf("Bruno", "Juca")) { word: String -> word.plus(" Gava") })
}