package task17

import kotlinx.coroutines.*

fun main () {
    runBlocking {

        val job1 = launch {
            delay(2000)
            println("Download finished")
        }

        val job2 = launch {
            delay(1000)
            println("Data processing")
        }
        joinAll(job1, job2)
        println("All task done")


        val job = launch {
            for (i in 0..1000) {
                if (!isActive) break  // Прекращаем выполнение, если корутина отменена

                delay(500)
                println("Running")

            }
        }
        delay(2000)
        job.cancel()
        job.join()   // Ждём завершения корутины
        println("Job canceled")





        launch {
            delay(1000)
            println("Hello world")
        }

        val result2 = async { resultSum() }
        println("Waiting")
        println(result2.await())

        val result = async { requestData() }
        println("Waiting")
        println(result.await())

    }

}

fun resultSum(): Int {
    return 5 + 7
}



suspend fun requestData () {
    delay(2000)
    println("Data received")
}


