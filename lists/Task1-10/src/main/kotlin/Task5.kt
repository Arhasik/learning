//Поиск элемента по условию
//Напишите функцию, которая принимает список строк и возвращает первое слово, начинающееся с буквы "А" (если такое есть).

fun main() {
    val list = mutableListOf<String>("buka1", "abugaga", "begege", "duka3")
    println(findElement(list))
    println(findElementFunction(list))
}

fun findElement (list: List<String>): String? {
    var findChar: Boolean
    val firstWord: String
    for (i in list) {
        findChar = i.matches("^A.*".toRegex(RegexOption.IGNORE_CASE))
        if (findChar == true) {
            firstWord = i
            return firstWord
        }
    }
    return null
}

fun findElementFunction (list: List<String>): String? {
    return list.find { it.startsWith("A", ignoreCase = true) }
}