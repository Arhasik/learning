//Напишите функцию, которая принимает список строк и возвращает новый список, содержащий длины этих строк.
fun main() {
    val list = mutableListOf<String>("buka1", "bugaga", "begege", "duka3")
    println(lengthString(list))
    println(lengthStringFunction(list))
}
fun lengthString (list: List<String>):List<Int> {
    val listIsEmpty = mutableListOf<Int>()
    var length = 0
    for (i in list) {
         length = i.length
        listIsEmpty.add(length)
    }
    return listIsEmpty
}

fun lengthStringFunction (list: List<String>): List<Int> {
    return list.map { it->it.length }
}