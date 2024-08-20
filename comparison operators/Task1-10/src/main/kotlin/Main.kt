import kotlin.random.Random
import kotlin.random.nextInt

//Напишите программу, которая проверяет, является ли число x больше 10 и меньше 20 одновременно.
//Если это так, выведите "Число в диапазоне от 10 до 20", в противном случае выведите "Число вне диапазона".
fun main() {
val x = Random.nextInt(1..30)
    if (x>10 && x<20) {
        println("The number in the range (10..20)- $x")
    }
    else {
        println("The number is out of range (10..20)- $x")
    }
}