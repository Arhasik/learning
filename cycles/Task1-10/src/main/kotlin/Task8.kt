//Напишите функцию printNonMultiplesOfThree, которая принимает число n и выводит на экран все числа от 1 до n,
//за исключением тех, которые делятся на 3. Используйте цикл for и оператор continue

fun main() {
    println("Enter number")

    val number = readLine()!!.toInt()
    println(printNonMultiplesOfThree(number))

}

fun printNonMultiplesOfThree (number: Int) {
    for (i in 1..number) {
        if (i % 3 !== 0) {
            println(i)
            continue
        }
    }
}