import kotlin.math.max
import kotlin.math.pow
import kotlin.random.Random

fun main() {
    var list = mutableListOf<Int>(3,4,7,8,8,2,1,2,43,657,4,67,86,456,3).sorted()
    var listUnique = mutableListOf<Int>()
    for (i in list) {
        var alreadyThereUnique = false
        for (j in listUnique) {
            if (i == j)
                alreadyThereUnique = true
        }
        if (!alreadyThereUnique) {
            listUnique.add(i)
        }
    }

    println(listUnique)
}

