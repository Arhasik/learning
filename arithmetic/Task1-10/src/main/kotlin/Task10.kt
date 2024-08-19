//Преобразование температуры:
//Напишите программу, которая принимает температуру в градусах Цельсия и преобразует её в градусы Фаренгейта.
fun main() {
    println("Enter first number temperature in Celsius")
    val numberOneCelsius: String? = readLine()

    if (numberOneCelsius?.matches("""\d+""".toRegex()) == true)
    {
        val numberOneCelsiusDouble: Double = numberOneCelsius.toDouble()
        val fahrenheit = numberOneCelsiusDouble * 9 / 5 + 32
        println("Temperature in Fahrenheit = $fahrenheit")
    }
    else {
        println("Error you had to enter a number")
    }
}