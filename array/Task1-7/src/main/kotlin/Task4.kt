//Напишите функцию, которая принимает массив целых чисел и возвращает количество четных чисел в массиве.
fun main() {
    val array = arrayOf(1,2,5,4,3,6,10,12,8)
    println("Amount of even numbers - ${amountEvenNumbers(array)}")
}

fun amountEvenNumbers (array: Array<Int>): Int {
    var amountNumbers = 0
    for (i in array)
        if (i % 2 == 0) {
            amountNumbers +=1
        }
    return amountNumbers
}