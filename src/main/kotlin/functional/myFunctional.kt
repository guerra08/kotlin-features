package functional

fun applyToList (values: List<Int>, method: (v: Int) -> Int): List<Int>{
    return values.map { method(it) }
}

fun main(args: Array<String>){
    print(applyToList(listOf(1,2,3,4,5)) { number: Int -> (number * 2) + 5 })
}