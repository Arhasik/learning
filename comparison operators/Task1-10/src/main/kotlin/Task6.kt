import kotlin.random.Random
import kotlin.random.nextInt
//Дано три числа a, b и c. Напишите программу, которая проверяет, являются ли все три числа равными.
//Если да, выведите "Числа равны", иначе "Числа не равны".
fun main() {
    val a = Random.nextInt(-2..2)
    val b = Random.nextInt(-2..2)
    val c = Random.nextInt(-2..2)
    if (a == b && b == c) {
        println("The numbers are equal: $a, $b, $c")
    }
    else {
        println("The numbers are not equal: $a, $b, $c")
    }
}