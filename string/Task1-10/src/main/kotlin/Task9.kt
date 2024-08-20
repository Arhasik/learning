//Создайте строку `sentence`, разделите её на слова с помощью метода `split`,
//и выведите каждый элемент массива на новой строке.
fun main() {
    val string: String = "Kotlin is the best programming language"
    println(string)
    val words: List<String> = string.split(" ")
    println(words)
    for (word in words)
    {
        println(word)
    }
}