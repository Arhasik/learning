//Напишите функцию, которая принимает список чисел и лямбда-выражение, которое вычисляет сумму всех элементов в списке.



fun main() {
    val numbers = listOf(1, 2, 3, 4, 5)
    val sum = calculateSum(numbers, {acc, i -> acc + i})
    println(sum)

}


fun calculateSum(numbers: List<Int>, operation: (Int, Int) -> Int): Int {
    return numbers.fold(0, operation)
}
