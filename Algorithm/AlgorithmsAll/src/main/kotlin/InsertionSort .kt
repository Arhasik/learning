fun main () {
    val list = mutableListOf<Int>(8, 7, 3, 6, 10, 4, 1, 2, 9, 5)
    println(list)

    for (i in 1..list.lastIndex) {
        val currentCache = list[i]
        var j = i
        while (j > 0 && list[j-1] > currentCache) {
            list[j] = list[j-1]
            j--
        }
        list[j] = currentCache
    }
    println(list)
}

