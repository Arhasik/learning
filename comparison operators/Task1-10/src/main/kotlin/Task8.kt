import kotlin.random.Random
import kotlin.random.nextInt
//Дано два числа a и b. Напишите программу, которая проверяет, оба ли числа не равны нулю.
//Если это так, выведите "Оба числа ненулевые", иначе "Одно или оба числа равны нулю".
fun main() {
    val a = Random.nextInt(-2..2)
    val b = Random.nextInt(-2..2)
    if (a != 0 && b != 0) {
        println("Both numbers are non-zero: $a, $b")
    }
    else {
        println("One or both numbers are zero: $a, $b")
    }
}