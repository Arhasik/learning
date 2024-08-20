//Создайте строку `text` и замените в ней все вхождения буквы `o` на `0`. Выведите результат.
fun main() {
    val string: String = "Kotlin is the best programming language"
    println(string)
    val replace: String = string.replace("o","O")
    println(replace)
}