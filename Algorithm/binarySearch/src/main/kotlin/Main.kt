import kotlin.random.Random
import kotlin.random.nextInt
//Дано отсортированный по возрастанию массив целых чисел. Напишите функцию,
//которая находит индекс заданного элемента с использованием бинарного поиска. Если элемент не найден, верните -1.

fun main() {
    val requiredNumber = 365
    val random = Random.nextInt(500..1000)
val array = Array(random) { i ->  (1..1000).random() }
    println(array.joinToString())
    val sortedSet = array.sorted().toSet()
    val sortedArray = sortedSet.toIntArray()
    println(sortedArray.joinToString())




println(binarySearch(sortedArray, requiredNumber))


}
//fun binarySearch(arr: IntArray, target: Int): Int {
//    var left = 0
//    var right = arr.size - 1
//
//    while (left <= right) {
//        val middle = left + (right - left) / 2
//
//        if (arr[middle] == target) {
//            return middle // Элемент найден
//        } else if (arr[middle] < target) {
//            left = middle + 1 // Ищем в правой половине
//        } else {
//            right = middle - 1 // Ищем в левой половине
//        }
//    }
//
//    return -1 // Элемент не найден
//}

fun binarySearch(sortedArray: Array<IntArray>, requiredNumber: Int): Int {
    var min = 0
    var max = sortedArray.lastIndex
    println(min)
    println(max)
    while (min <= max) {
        var middle = (min + max) / 2
        var current = sortedArray[middle]


        if (requiredNumber == current) {

            println(current)
            return current

        } else if (requiredNumber > current) {
            min = middle + 1
            println(min)
            println(current)

        } else {
            max = middle - 1
            println(max)
            println(current)
        }
    }
    return -1
}