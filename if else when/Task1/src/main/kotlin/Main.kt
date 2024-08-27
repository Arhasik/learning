//Напишите программу, которая принимает число и выводит, является ли оно четным или нечетным.

fun main() {
    val numberString: String? = readLine()
    val numberInt: Int = numberString!!.toInt()

    if (numberInt % 2 == 0) {
        println("The number is even")
    }
    else println("The number is not even")
}