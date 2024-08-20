//Удаление пробелов в начале и конце строки
//Создайте строку `text` с пробелами в начале и в конце. Удалите их с помощью `trim` и выведите результат.

fun main() {
    val string: String = "   text   "
    println("Text without spaces - ${string.trim()}")
}