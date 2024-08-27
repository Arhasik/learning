//Напишите программу, которая запрашивает у пользователя целое положительное число n и с
//помощью цикла while вычисляет сумму всех чисел от 1 до n. Выведите результат на экран.
fun main() {
    println("enter positive number")
    val positiveNumber = readLine()?.toIntOrNull()
    var number = 1
    var summa = 0
    if (positiveNumber !== null && positiveNumber > 0) {
        while (number <= positiveNumber) {
            summa += number
            number++
//            println(summa)
        }
        println("$summa")
    } else {
        println("error")
    }
}