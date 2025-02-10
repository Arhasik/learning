import kotlinx.coroutines.*

fun main() { runBlocking {
    val job = mutableListOf<Job>()

    val progressJob = launch {
        while (isActive) {
            print(".")
            delay(500)
        }
    }

    try {
        job += launch {
            try {
                val result = withTimeout(3000) {Fibonacci.take(50)}
                println("\nFibonacci (50) = $result")
            } catch (e: TimeoutCancellationException) {
                println("\nThe calculation exceeds the time limit")
            }
        }

        job += launch {
            val result = Fibonacci.take(40)
            println("\nFibonacci (40) = $result")
        }

        job += launch {
            val result = Fibonacci.take(30)
            println("\nFibonacci (30) = $result")
        }

    } finally {
        job.forEach { it.join() }
        progressJob.cancel()
    }

}
}
