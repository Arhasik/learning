//Напишите программу, которая принимает число и выводит:
//•	"Положительное число", если число больше нуля.
//•	"Отрицательное число", если число меньше нуля.
//•	"Ноль", если число равно нулю.

fun main() {
    val numberString: String? = readLine()
    val numberInt: Int = numberString!!.toInt()

    if (numberInt > 0) {
        println("The number greater than zero")
    }
    else if (numberInt == 0) {
        println("The number is equal to zero")
    }
    else println("The number less than zero")
}