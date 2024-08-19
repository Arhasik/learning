import kotlin.math.pow
//Квадрат числа:
//Напишите программу, которая принимает число от пользователя и выводит его квадрат.
fun main() {
    println("Enter first number")
    val numberOne: String? = readLine()
    if (numberOne?.matches("""\d+""".toRegex()) == true )
    {
        val numberOneDouble: Double = numberOne.toDouble()
        val degree = numberOneDouble.pow(2)
        println("Exponentiation = $degree")
    }
    else {
        println("Error you had to enter a number")
    }
}