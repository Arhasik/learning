//Напишите функцию, которая принимает массив целых чисел и возвращает среднее арифметическое всех элементов массива.
fun main() {
    val array = arrayOf(1,2,5,4,3,6)
    println("Average first- ${averageValue(array)}")
    println("Average second- ${averageValueFunction(array)}")

}
fun averageValue (array: Array<Int>):Double {
    var size = 0
 var sum = 0
    for (i in array) {
        sum += i
        size += 1
    }
    val averageValue: Double = sum.toDouble()/size
    return averageValue
}

fun averageValueFunction (array: Array<Int>):Double {
    return array.average()
}