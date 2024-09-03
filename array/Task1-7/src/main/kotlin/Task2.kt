//Напишите функцию, которая принимает массив целых чисел и возвращает сумму всех элементов массива.
fun main() {
    val array = arrayOf(1,2,5,4,3,6)
    println("Sum first- ${sumArray(array)}")
    println("Sum second- ${sumArrayFunction(array)}")

}
fun sumArray (array: Array<Int>):Int {
    var sum = 0
    for (i in array){
        sum += i
    }
    return sum
}

fun sumArrayFunction (array: Array<Int>):Int {

    return array.sum()
}

