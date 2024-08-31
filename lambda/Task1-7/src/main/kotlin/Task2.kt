//Напишите функцию, которая принимает список строк и лямбда-выражение, которое проверяет, содержится ли в списке элемент,
//удовлетворяющий условию. Например, строка, которая начинается с буквы "A".
fun main() {
    val list = listOf<String>("buka", "duniy", "arhsik", "gopka", "pupa", "zalupa")
    val result = containsElement(list, { it.startsWith("A", ignoreCase = true) })
println(result)
}

fun containsElement(list: List<String>, lambda: (String) -> Boolean): Boolean {
    return list.any(lambda)
}