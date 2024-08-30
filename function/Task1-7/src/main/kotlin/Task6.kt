//Напишите функцию average, которая принимает массив целых чисел и возвращает среднее значение элементов массива.
fun main() {
val array = arrayOf(1,2,3,4,5,37,28)
    println(average(array))
}
fun average (array: Array <Int>):Int {
    return array.average().toInt()
}