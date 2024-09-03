//Напишите функцию, которая принимает массив целых чисел и возвращает пару значений: минимальный элемент массива и его индекс.
fun main() {
    val array = arrayOf(10, 8, 5, 2, 3, 1, 15, 18)


    println(array.joinToString())
    println(findMinWithIndex(array))
    println(findMinWithIndexFunction(array))

}
fun findMinWithIndex (array: Array<Int>): Pair<Int, Int> {
    var min = array[0]
    var minIndex = 0

    for (i in 1 until array.size) {
        if (array[i] < min) {
            min = array[i]
            minIndex = i
        }
    }
    return Pair(min, minIndex)
}


fun findMinWithIndexFunction (array: Array<Int>): Pair<Int, Int>{
    val minValue = array.min()
    val minIndex = array.indexOf(minValue)
return Pair(minIndex, minValue)
}