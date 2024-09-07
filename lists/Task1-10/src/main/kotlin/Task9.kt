import kotlin.coroutines.CoroutineContext

//Напишите функцию, которая принимает список строк и группирует их по длине,
//возвращая Map<Int, List<String>>, где ключом будет длина строки, а значением — список строк этой длины.

fun main() {
    val list = listOf<String >("bsdf", "asdmvffd", "pojknl", "werwe","fdg", "ppp")

    println(groupStringsByLength(list))
    println(groupStringsByLengthFunction(list))

}


fun groupStringsByLength(list: List<String>): Map<Int, List<String>> {
    val result = mutableMapOf<Int, MutableList<String>>()

    for (string in list) {
        val length = string.length
        if (result.containsKey(length)) {
            result[length]?.add(string)
        } else {
            result[length] = mutableListOf(string)
        }
    }

    return result
}

fun groupStringsByLengthFunction(list: List<String>): Map<Int, List<String>> {
    return list.groupBy { it.length }
}