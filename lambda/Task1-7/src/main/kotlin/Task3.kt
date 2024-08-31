//Напишите функцию, которая принимает список чисел и лямбда-выражение,
//которое считает количество элементов, удовлетворяющих заданному условию. Например, количество четных чисел.

fun main() {
    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val count = countItem(numbers, {it % 2 == 0})
    println(count)
}

fun countItem (list: List<Int>, lambda: (Int) -> Boolean ): Int {
    return list.count(lambda)
}