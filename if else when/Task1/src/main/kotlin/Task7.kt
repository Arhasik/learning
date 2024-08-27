import java.text.SimpleDateFormat

//Напишите программу, которая принимает время в 24-часовом формате (например, 14:00) и выводит:
//•	"Утро", если время от 6:00 до 11:59,
//•	"День", если время от 12:00 до 17:59,
//•	"Вечер", если время от 18:00 до 21:59,
//•	"Ночь", если время от 22:00 до 5:59.

fun main() {
    println("Enter time HH:mm")
    val enter = readLine()

    if (enter != null && ":" in enter) {
        val parts = enter.split(":")
        if (parts.size == 2 && parts[0].toIntOrNull() != null && parts[1].toIntOrNull() != null) {
            val hours = parts[0].toInt()
            val minutes = parts[1].toInt()

            if (hours in 0..23 && minutes in 0..59) {
                val timeOfDay = when (hours) {
                    in 6..11 -> "Morning"
                    in 12..17 -> "Afternoon"
                    in 18..21 -> "Evening"
                    else -> "Night"
                }
                println(timeOfDay)
            }
        }
    } else {
        println("Incorrect enter")
    }
}
