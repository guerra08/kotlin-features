package coroutines

import kotlinx.coroutines.*
import java.net.URL

// Coroutines can be summed as a cheaper "thread" to execute async tasks

/**
 * This mocks a GET HTTP request to an API
 */
suspend fun getUserFromGithubApi(username: String): String {
    return withContext(Dispatchers.IO) {
        URL("https://api.github.com/users/$username").readText()
    };
}

fun main() = runBlocking {
    println("Starting request...")
    coroutineScope {
        launch {
            println(getUserFromGithubApi("guerra08"))
        }
        println("Yoda, am I")
    }
    println("End of main.")
}