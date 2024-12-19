import kotlin.random.Random
import kotlin.random.nextInt

fun main() {
val array = Array(10) {Random.nextInt(0..10)}.toSet().toIntArray()
    println(array.toList())

    var stop = false
    while (!stop) {
        println("2")
        stop = true
        println("3")

         for (i in 1 until array.size) {
             val left = i-1
             val right = i
             if(array[left] > array[right]){
                 val cacheLeft = array[left]
                 array[left]= array[right]
                 array[right]= cacheLeft
                 stop = false
                 println(array.toList())
             }

         }
    }

    val arrayThreeVariable = Array(10) {Random.nextInt(0..10)}.toSet().toIntArray()
    println("\n${arrayThreeVariable.toList()}")

    for(j in 0 until arrayThreeVariable.size-1) {
        for (i in 0 until arrayThreeVariable.size-j-1) {
            if (arrayThreeVariable[i] > arrayThreeVariable [i+1]) {
                val cacheLeft = arrayThreeVariable[i]
                arrayThreeVariable[i] = arrayThreeVariable[i+1]
                arrayThreeVariable[i+1] = cacheLeft
                println("${arrayThreeVariable.toList()}")
            }
        }
    }
}