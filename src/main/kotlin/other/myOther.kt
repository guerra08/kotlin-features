package other

data class Thing (val name: String, val surname: String)

fun main() {
    val theThing = Thing("Bobby", "Doe")
    // Destructuring, just like JS
    val (name, surname) = theThing
    print("$name $surname")


}
