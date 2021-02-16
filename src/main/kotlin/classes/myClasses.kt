package classes

/**
 * Classes are cheap and easy to be declared
 */
class Person(val name: String, val email: String)

/**
 * Data classes implement toString, equals / hashCode and copy
 */
data class User(val username: String, val age: Int)

class Product(val name: String, val price: Double){
    fun priceByAmount(amt: Int): Double = this.price * amt
}

fun main() {
    //You don't need to use the new keyword to create an instance
    val person = Person("Bruno Guerra", "gguerrabruno@outlook.com")
    println(person.email)
    val user = User("fulano08", 21)
    println(user.toString())
    val product = Product("phone", 300.00)
    println(product.priceByAmount(5))
}