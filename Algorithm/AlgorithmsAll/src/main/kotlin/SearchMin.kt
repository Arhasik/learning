import kotlin.random.Random
import kotlin.random.nextInt

fun main () {
    var array = Array(10) {Random.nextInt(0..100)}
    println(array.toList())

    var min = array[0]

    for (i in 1..array.size-1) {
        if (min > array[i]) {
            min = array[i]
        }
    }
    println(min)
}