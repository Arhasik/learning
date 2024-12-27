import kotlin.math.max
import kotlin.math.pow
import kotlin.random.Random

fun main() {
    var list = mutableListOf<Int>(3,4,7,8,8,2,1,2,43,657,4,67,86,456,3).sorted()
var lisUnique = mutableListOf<Int>()
    for (i in 0 until list.size-1) {
        if (list[i] !== list[i+1]) {
            lisUnique.add(list[i])
        }
    }
    lisUnique.add(list[list.lastIndex])

    println(lisUnique)
}

