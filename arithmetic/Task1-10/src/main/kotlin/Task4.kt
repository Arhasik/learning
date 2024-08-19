fun main() {
//Деление двух чисел:
//Напишите программу, которая принимает два числа от пользователя, делит первое число на второе и выводит результат. Учтите возможность деления на ноль.
    println("Enter first number")
    val numberOne: String? = readLine()
    println("Enter second number")
    val numberTwo: String? = readLine()
    if ((numberTwo?.matches("""\d+""".toRegex()) == true && numberOne?.matches("""\d+""".toRegex()) == true) )
    {
        val numberOneDouble: Double = numberOne.toDouble()
        val numberTwoDouble: Double = numberTwo.toDouble()
        val division = numberOneDouble / numberTwoDouble
        println("Division = $division")
    }
    else {
        println("Error you had to enter a number")
    }
}