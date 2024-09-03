//Напишите функцию,
//которая принимает массив целых чисел и возвращает максимальное значение в этом массиве.
fun main() {
    val array = arrayOf(1,2,5,4,3,6)
    println("Max value first - ${maxValue(array)}")
    println("Max value second - ${maxValueFunction(array)}")

}

fun maxValue (array: Array<Int>): Int {
    var largestElement = 0
    for (number in array){
        if(largestElement <= number) {
            largestElement = number
        }
    }
    return largestElement
}

fun maxValueFunction (array: Array<Int>): Int {
return array.max()
}