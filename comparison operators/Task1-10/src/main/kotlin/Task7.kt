import kotlin.random.Random
import kotlin.random.nextInt
//Напишите программу, которая проверяет, попадает ли число x в диапазон от 0 до 100 включительно
//или в диапазон от 200 до 300 включительно. Если да, выведите "Число попадает в один из диапазонов", иначе "Число вне диапазонов".
fun main() {
    val x = Random.nextInt(-50..500)

    if (x in 0..100 || x in 200..300) {
        println("The number falls into one of the ranges: $x")
    }
    else {
        println("The number is out of range: $x")
    }
}