fun main () {
    var array = arrayOf(3, 10, 2, 5, 1, 6, 4, 8, 9, 7).toList().toMutableList()
    println( array )

    for (i in 0..array.size-1) {
        val indexMin = min(array, i)
        val minValue = array[i]
        array[i] = array[indexMin]
        array[indexMin] = minValue
        println(array)
    }
}
fun min (array: List<Int>, step: Int): Int {
    var minIndex = step
    var min = array[step]
    for (i in step..array.size-1) {
        if (min > array[i]) {
            min = array[i]
            minIndex = i
        }
    }
    return minIndex

}