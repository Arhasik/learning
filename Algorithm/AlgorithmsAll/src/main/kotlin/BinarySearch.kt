import kotlin.random.Random
import kotlin.random.nextInt

fun main  () {

val array = Array(10) {Random.nextInt(0..10)}.toSet().toSortedSet().toIntArray()
    val randomNumber = array.random()

    println(array.toList())
    println(randomNumber)

    var right = array.size-1
    var left = 0
    var stop = false
    while (!stop) {
        val middle = (right + left) / 2
        if (randomNumber == array[middle]) {
            stop = true
            println("$middle, ${array[middle]}")
        }
            else if (randomNumber < array[middle]) {
                right = middle+1
            }
            else if (randomNumber > array[middle]) {
                left = middle-1
            }
        }
    }


