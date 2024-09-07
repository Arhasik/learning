//Напишите функцию, которая принимает список целых чисел и возвращает новый список,
//содержащий только уникальные элементы (без дубликатов).

fun main() {
    val list = mutableListOf<Int>(1,2,3,4,5,4,3,2,1,0)
    println(uniqueElement(list))
    println(uniqueElementFunction(list))
}
fun uniqueElement (list: List<Int>): List<Int> {
    val emptyList = mutableListOf<Int>()
    for (i in list){
        if (i !in emptyList) {
            emptyList.add(i)
        }
    }
    return emptyList
}
fun uniqueElementFunction (list: List<Int>): List<Int> {
    return list.toSet().toList()
}