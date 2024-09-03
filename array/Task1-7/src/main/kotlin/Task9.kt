//Напишите функцию, которая принимает массив целых чисел и число n, и возвращает новый массив, элементы которого сдвинуты вправо на n позиций.

fun main() {
    val array = arrayOf(-1, -2, 3, -4, 5, -4, 7, 3, -9, 10)
    val n = 2
    val resultArray = Array(5) {0}


    println(array.joinToString())
    println(resultArray.joinToString())
    println(shiftArray(array,n).joinToString())
}

fun shiftArray (array: Array<Int>, n: Int): Array<Int> {
    val size = array.size
    val resultArray = Array(size) {0}
    for (i in array.indices) {
        val newIndex = (i + n) % size
        resultArray[newIndex] = array[i]
    }
    return resultArray
}

