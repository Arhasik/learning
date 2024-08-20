import kotlin.random.Random
import kotlin.random.nextInt

//Даны два целых числа a и b. Напишите программу, которая проверяет, является ли одно из них положительным,
//а другое отрицательным. Если условие выполняется, выведите "Числа противоположны по знаку", иначе "Числа одного знака".
fun main() {
    val a = Random.nextInt(-10..10)
    val b = Random.nextInt(-10..10)
    if ((a > 0 && b > 0) || (a < 0 && b < 0)) {
        println("Numbers of the same sign: $a, $b")
    }
    else {
        println("The numbers are opposite in sign: $a, $b")
    }
}