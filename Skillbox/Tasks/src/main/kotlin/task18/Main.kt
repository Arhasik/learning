package task18

import kotlinx.coroutines.*
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.*
import java.util.concurrent.Flow.Subscriber

suspend fun main () {
    runBlocking {

        val number = flowOf(0.0, 1.0, 2.0, 3.0, 4.0, 5.0)
        number.collect { value -> println(value) }

        val listNumber = listOf<Double>(0.1, 1.1, 2.1, 3.1, 4.1, 5.1).asFlow()
        listNumber.collect { println(it) }
        flow().collect { value -> println(value) }

        println(flow().last())
        println(flow().first())
        println(flow().toList())

        val flowFilter = flow().filter { it -> it % 2 == 0 }.map { it * 2 }
        flowFilter.collect { it -> println(it) }

        flow1().collect { it -> println(it) }

        flow2().zip(flow3()) {a ,b -> "$a,$b" }.collect { println(it) }


        val stateFlow = MutableStateFlow(0)
        val updateJob = launch {
            for (i in 1..5) {
                delay(200)
                stateFlow.value += 1
            }
        }

        val collectJob = launch {
            withTimeout(1200) {  // Завершит сбор через 200 мс
                stateFlow.collect { value ->
                    println("Current value: $value")
                }
            }
        }


        // Ждем завершения корутины обновления
        updateJob.join()

        // Ждем завершения корутины
        collectJob.join()

        println("Program finish.")


//        stateFlow.take(6).collect {it -> println("--$it") }

        val sharedFlow = MutableSharedFlow<Int>()

        val subscriber1 = launch {
            withTimeout(3000) {
                sharedFlow.collect { println("Subscriber 1 - $it") }
            }
        }
        val subscriber2 = launch {
            withTimeout(3000) {
                sharedFlow.collect { println("Subscriber 2 - $it") }
            }
        }
       val updateValue =  launch {
            for (i in 1..5) {
                delay(500) // Задержка между отправкой значений
                sharedFlow.emit(i) // Отправляем значение в SharedFlow
            }
        }

        // Ждем завершения отправки значений
        delay(3000)
        subscriber1.join()
        subscriber2.join()
        updateValue.join()

        println("Программа завершена.")

        val channel = Channel<Int> ()

         launch {
            for (i in 1..5) {
                channel.send(i)
            }
            channel.close()
        }

        launch {
            for (i in channel) {
                println("+++$i")
            }
        }





    }

}


fun flow1 (): Flow<Char> = flow {

    for (i in 'a'..'g') {
        delay(200)
        if (i == 'c') {
            throw NumberException(message = "The letter 'c' can't be" )
        }
        emit(i)
    }
}.catch { e->println("Error: ${e.message}")
    emit('e')}


fun flow (): Flow<Int> = flow {
    for (i in 0 ..10) {
        delay(100)
        emit(i)
    }

}

fun flow2 (): Flow <Int> {  return flow {
    for (i in 1..3) {
        delay(100)
        emit(i)
    }
}
}

fun flow3 (): Flow <Char> {  return flow {
    for (i in 'a'..'c') {
        delay(100)
        emit(i)
    }
}
}