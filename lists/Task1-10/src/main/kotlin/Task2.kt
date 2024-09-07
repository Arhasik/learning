//Напишите функцию, которая принимает список целых чисел и возвращает второй по величине элемент в списке.
//Если второго максимального элемента нет, функция должна вернуть null.

fun main() {
    val list = mutableListOf<Int>(1,2,3,4,-3,6,-1,-2,5,-4,-5)
    println(list)
    println(maxElement(list))
    println(maxElementFunction(list))
}

fun maxElement (list: List<Int>):Int? {
    if (list.size < 2) return  null
    var max: Int? = null
    var secondMax: Int? = null
    for (i in list){
        when {
            max == null || i > max -> {
                secondMax = max
                max = i
            }
            (secondMax == null || i > secondMax) && i != max -> {
                secondMax = i
            }
        }
    }
    return secondMax
}

fun maxElementFunction (list: List<Int>): Int? {
    val sortedList = list.sorted()
    val secondMax = sortedList.lastIndex-1

    if (sortedList.size < 2) {
        return null
    }
    return sortedList[secondMax]
}