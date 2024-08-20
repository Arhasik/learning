import kotlin.random.Random
import kotlin.random.nextInt
//Напишите программу, которая проверяет, находится ли число n вне диапазона от -10 до 10 включительно.
//Если это так, выведите "Число вне диапазона", иначе "Число в диапазоне".
fun main() {
    val n = Random.nextInt(-20..20)

    if (n !in -10..10) {
        println("The number is out of range: $n")
    }
    else {
        println("The number in the range: $n")
    }
}