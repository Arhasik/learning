//Напишите функцию, которая принимает список чисел и лямбда-выражение для сортировки этого списка по убыванию.
fun main() {
    val numbers = listOf(5, 2, 8, 1, 4)
    val sortedNumbers = sortedNumbers(numbers, {it})
    println(sortedNumbers)
}
fun sortedNumbers (list: List <Int>, lambda: (Int) -> (Int)): List<Int> {
    return list.sortedBy(lambda)
}