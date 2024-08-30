//Создайте функцию toUpperCase, которая принимает строку и возвращает эту строку в верхнем регистре.
fun main() {
val string: String = "Spell the name"
    println(toUpperCase(string = string))
}
fun toUpperCase(string: String): String {
    return string.uppercase()
}