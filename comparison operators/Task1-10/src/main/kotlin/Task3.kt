import kotlin.random.Random
import kotlin.random.nextInt

//Напишите программу, которая принимает на вход три числа и проверяет,
//являются ли все три числа положительными. Если это так, выведите "Все числа положительные", иначе "Есть отрицательные числа".
fun main() {
    val a = Random.nextInt(-10..10)
    val b = Random.nextInt(-10..10)
    val c = Random.nextInt(-10..10)
    if (a > 0 && b > 0 && c > 0) {
        println("All numbers are positive: $a, $b, $c")
    }
    else {
        println("There are negative numbers: $a, $b, $c")
    }
}