package extensions

val String.firstWord: String
    get() = this.split(" ")[0]

val String.sumOfChar: Int
    get() = this.chars().sum()

fun main(args: Array<String>){
    val name = "Bruno Guerra";
    println(name.firstWord)
    println(name.sumOfChar)
}