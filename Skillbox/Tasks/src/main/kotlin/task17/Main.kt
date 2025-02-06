package task17

import kotlin.concurrent.thread

fun main() {

    println("основной поток запустился")

    val thread1 = thread {
        Thread.sleep(1000)
        println("Поток 1 завершился")
    }

    val thread2 = thread {
        Thread.sleep(2000)
        println("Поток 2 завершился")

    }

    val thread3 = thread {
        Thread.sleep(3000)
        println("Поток 3 завершился")

    }

    thread1.join()
    thread2.join()
    thread3.join()

    println("основной поток закончился")


    fetchDataAsync(callback = object: Callback {})

    fetchDataAsync1 { result -> println(result) }

}

fun fetchDataAsync(callback: Callback) {
    thread{
        Thread.sleep(2000)
         callback.message()
    }
}
fun fetchDataAsync1(callback: (String) -> Unit) {
    thread{
        Thread.sleep(2000)
        callback("Все четко")
    }
}

interface Callback {
    fun message () {
         println("Данные загружены")
    }

}