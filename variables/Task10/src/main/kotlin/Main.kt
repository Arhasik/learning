//Создайте переменную temperature типа Float, инициализируйте её значением температуры в градусах Цельсия.
//Преобразуйте эту температуру в градусы Фаренгейта и выведите результат.
fun main() {
    val temperatureCelsius: Float = 36.6f
    val temperatureFahrenheit: Float = (temperatureCelsius * 9/5) + 32
    println("Temperature in degrees Fahrenheit: $temperatureFahrenheit")
}