package Taskk1

fun main() {
    val array = listOf(10, 66, 4, 16, 99, 35, 11, 123)

    val top5 = findTopElements(array, 5)
    println("Top 5: $top5")

    val top8 = findTopElements(array, 8)
    println("Top 8: $top8")

    val bottom5 = findBottomElements(array, 5)
    println("Bottom 5: $bottom5")
}

fun findMaxUnderBoundary(inputArray: List<Double>, topBoundary: Int): Int {
    var currentMax = Int.MIN_VALUE
exception(array = inputArray, number = topBoundary)
    for (item in inputArray) {
        if (item < topBoundary) {
            currentMax = maxOf(currentMax, item)
        }
    }

    return currentMax
}

fun findTopElements(inputArray: List<Int>, numberOfElements: Int): List<Int> {
    val topElements = mutableListOf<Int>()
    var previousMax = Int.MAX_VALUE

    repeat(numberOfElements) {
        val currentMax = findMaxUnderBoundary(inputArray, previousMax)
        previousMax = currentMax
        topElements.add(currentMax)
    }

    return topElements
}

fun findBottomElements(inputArray: List<Int>, numberOfElements: Int): List<Int> {
    val bottomElements = mutableListOf<Int>()
    var previousMin = Int.MIN_VALUE

    repeat(numberOfElements) {
        val currentMin = inputArray.filter { it > previousMin }.minOrNull() ?: return bottomElements
        previousMin = currentMin
        bottomElements.add(currentMin)
    }

    return bottomElements
}

fun exception (array: List<Any>, number: Any) {
    if (array.all{it is Int} || number !is Int) {
        throw InvalidNumberExceptions("Не правильные числа")
    }
}

