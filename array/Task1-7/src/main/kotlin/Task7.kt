//Напишите функцию, которая принимает массив целых чисел и возвращает новый массив,
//содержащий только положительные числа из исходного массива.
fun main() {
    val array = arrayOf(-1, -2, 3, -4, 5, -6, 7, 8, -9, 10)

    println(array.joinToString())
    println(positiveNumber(array).joinToString())
    println(positiveNumberFunction(array).joinToString())



}
fun positiveNumber(array: Array<Int>): Array<Int?> {
    val arrayPositiveNumber = arrayOfNulls<Int>(array.size+1)
    for (i in array) {
        if (i > 0) {
            arrayPositiveNumber[i] = i
            }
    }
    return arrayPositiveNumber
}

fun positiveNumberFunction (array: Array<Int>): Array<Int> {
    return array.filter { it > 0 }.toTypedArray()
}