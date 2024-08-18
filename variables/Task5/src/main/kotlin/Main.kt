//Напишите программу, которая запрашивает у пользователя его имя и возраст, а затем выводит сообщение, например,
//"Привет, Алекс! Тебе 20 лет." Имя должно храниться в переменной типа String, а возраст — в переменной типа Int.

fun main() {
    println("Enter first name")
    val firstName: String? = readLine()
    println("Enter age")
    val ageString: String? = readLine()
    if (ageString?.matches("""\d+""".toRegex()) == true)
    {
        val ageInt: Int = ageString.toInt()
        println("Hello, $firstName! You are $ageInt years old")
    }
    else {
        println("Error. Enter age in numbers")
    }

}