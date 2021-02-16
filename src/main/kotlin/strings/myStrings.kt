package strings

val name = "Bruno Guerra"
val time = 6

// The Java way
val theJavaWay = "My name is " + name + " and I have been a programmer for " + time + " years."
val theKotlinWay = "My name is $name and I have been a programmer for $time years."

fun main(args: Array<String>) {
    println(theJavaWay)
    println(theKotlinWay)
}