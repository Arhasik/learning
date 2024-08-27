//Напишите функцию sumInRange, которая принимает два целых числа start и end и возвращает сумму всех чисел в диапазоне от start до end включительно.
//Если start больше end, функция должна вернуть 0. Используйте цикл for.

fun main() {
    println("Enter start number")
    val start = readLine()!!.toInt()
    println("Enter end number")
    val end = readLine()!!.toInt()
    print("Summa - ")
    println(sumInRange(start, end))
}

fun sumInRange (start: Int, end: Int):Int {
    var summa = 0
    if (end > start) {
        for (x in start..end) {
            summa += x
        }
return summa
    }
    else {
        return 0
    }
}