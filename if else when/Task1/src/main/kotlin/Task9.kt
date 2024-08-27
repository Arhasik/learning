//Используя when, напишите программу, которая принимает месяц (число от 1 до 12)
//и выводит название соответствующего сезона года (зима, весна, лето, осень).
fun main() {
    println("Enter number month")
    val numberMonth = readLine()?.toIntOrNull()
    if (numberMonth !== null) {
        val season: String = when (numberMonth) {
            1, 2, 11 -> "winter"
            in 2..5 -> "spring"
            in 5..8 -> "summer"
            in 8..11 -> "autumn"
            else -> "input correct number"
        }
        println(season)
    }
    else {
        println("Don't do that.")

    }
}