//Доступ к символам строки
//Создайте строку `text` и выведите на экран её первый и последний символ.
fun main() {
    val string: String = "text"
    val charFirst = string[0]
    val charLast = string[string.length -1]
    println("First symbol - $charFirst, Last symbol - $charLast")
}