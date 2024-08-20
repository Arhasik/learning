import kotlin.random.Random
import kotlin.random.nextInt
//Напишите программу, которая проверяет, является ли число x кратным 5 или 7.
//Если условие выполняется, выведите "Число кратно 5 или 7", иначе "Число не кратно ни 5, ни 7".
fun main() {
    val x = Random.nextInt(-50..200)

    if ((x%5)==0 || (x%7)==0) {
        println("The number is a multiple of 5 or 7: $x")
    }
    else {
        println("The number is not a multiple of either 5 or 7: $x")
    }
}