//Преобразование минут в часы:
//Напишите программу, которая принимает количество минут от пользователя и выводит эквивалентное количество часов и минут.
fun main() {
    println("Enter first number")
    val numberOneMinute: String? = readLine()
    if (numberOneMinute?.matches("""\d+""".toRegex()) == true )
    {
        val numberOneInt: Int = numberOneMinute.toInt()
        val hours = numberOneInt / 60
        val remainingMinutes = numberOneInt % 60
        println("$numberOneMinute The minutes are $hours hours and $remainingMinutes minutes.")
    }
    else {
        println("Error you had to enter a number")
    }
}