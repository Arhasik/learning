import kotlin.random.Random
import kotlin.random.nextInt
//Дано целое число n. Напишите программу, которая проверяет, является ли это число четным и одновременно больше 100.
//Если условие выполняется, выведите "Число четное и больше 100", иначе "Условие не выполнено".
fun main() {
    val n = Random.nextInt(-50..200)

    if ((n%2)==0 && n>100) {
        println("The number is even and greater than 100: $n")
    }
    else {
        println("The condition is not fulfilled: $n")
    }
}