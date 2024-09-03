//Напишите функцию, которая принимает массив целых чисел и возвращает новый массив, в котором удалены все дубликаты.

fun main() {
    val array = arrayOf(-1, -2, 3, -4, 5, -4, 7, 3, -9, 10)

    println(array.joinToString())
    println(removingDuplicatesFunction(array))
}


fun removingDuplicatesFunction (arrayFirst: Array<Int>): List<Int> {
    return arrayFirst.distinct()
    }
