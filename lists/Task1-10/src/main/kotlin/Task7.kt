//Напишите функцию, которая принимает два списка целых чисел и возвращает новый список,
//состоящий из элементов обоих списков.

fun main() {
    val listFirst = mutableListOf<Int>(1,2,3,4,5,4,3,2,1,0)
    val listSecond = mutableListOf<Int>(1,2,3,4,5,4,3,2,1,0)

    println(combiningList(listFirst,listSecond))
    println(combiningListFunction(listFirst, listSecond))
}
 fun combiningList (listFirst: List<Int>, listSecond: List<Int>): List<Int> {
     val emptyList = mutableListOf<Int>()
     for (first in listFirst) {
         emptyList.add(first)

     }
     for (second in listSecond) {
         emptyList.add(second)
     }
     return emptyList
 }

fun combiningListFunction (listFirst: List<Int>, listSecond: List<Int>): List<Int> {

    return listFirst + listSecond
}