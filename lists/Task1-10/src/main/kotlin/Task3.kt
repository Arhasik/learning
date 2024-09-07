import java.util.*

//Напишите функцию, которая принимает список строк и возвращает новый список,
//содержащий только те строки, которые содержат хотя бы одну цифру, и преобразует их в верхний регистр.

fun main() {
    val list = mutableListOf<String>("buka1", "bugaga", "begege", "duka3")
    println(findNumberInString(list))
    println(findNumberInStringNoFunction(list))
}

fun findNumberInStringNoFunction (list: List<String>):List<String> {
    val listIsEmpty  = mutableListOf<String>()
    for (i in list) {
        when {
            i.matches("^\\D*$".toRegex()) -> listIsEmpty.add(i)
        }
    }
    return listIsEmpty.map{it->it.uppercase()}


}
fun findNumberInString (list: List<String>):List<String> {
    val newList = list.filter { it -> it.matches("^\\D*$".toRegex()) }
    return newList.map { it -> it.uppercase() }
}