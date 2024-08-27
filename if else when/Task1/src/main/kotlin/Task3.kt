//Используя when, напишите программу, которая принимает число от 1 до 7 и выводит название соответствующего дня недели.

fun main() {
    val number = readLine()!!.toInt()

    val dayOfWeek = when (number) {
        1-> "Monday"
        2-> "Tuesday"
        3-> "Wednesday"
        4-> "Thursday"
        5-> "Friday"
        6-> "Saturday"
        7-> "Sunday"
        else -> "Enter number from 1 to 7"
    }
println(dayOfWeek)
}