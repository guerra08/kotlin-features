package coroutines

import kotlinx.coroutines.*

// Coroutines can be summed as a cheaper "thread" to execute async tasks

/**
 * This mocks a GET HTTP request to an API
 */
suspend fun getUserByApiRequest(): String{
    delay(333)
    return "User 1"
}

fun main() = runBlocking {
    println("Hello")
    coroutineScope {
        launch {
            println(getUserByApiRequest())
        }
        println("World")
        for (i in 1..100){
            println(i)
        }
    }

}