//Напишите функцию, которая принимает список строк и возвращает Map<String, Int>,
//где ключом будет строка, а значением — количество её вхождений в список.

fun main() {
    val list = listOf<String >("bsdf", "asdmvffd", "pojknl", "werwe","fdg", "ppp")

    println(countStringOccurrences(list))
    println(countStringOccurrencesFunction(list))
    println(repeat(3, "sdbfks"))
}
fun countStringOccurrences(list: List<String>): Map<String, Int> {
    val result = mutableMapOf<String, Int>()

    for (string in list) {
        if (result.containsKey(string)) {
            result[string] = result[string]!! + 1
        } else {
            result[string] = 1
        }
    }
    return result
}

fun countStringOccurrencesFunction(list: List<String>): Map<String, Int> {
    return list.groupingBy { it }.eachCount()
}

fun repeat (n: Int, s: String): String {
    val repeat = s.repeat(n)
    return repeat
}