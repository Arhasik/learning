//Остаток от деления:
//Напишите программу, которая принимает два числа от пользователя, делит первое число на второе и выводит остаток от деления.
fun main() {
    println("Enter first number")
    val numberOne: String? = readLine()
    println("Enter second number")
    val numberTwo: String? = readLine()
    if ((numberTwo?.matches("""\d+""".toRegex()) == true && numberOne?.matches("""\d+""".toRegex()) == true) )
    {
        val numberOneDouble: Double = numberOne.toDouble()
        val numberTwoDouble: Double = numberTwo.toDouble()
        val remainderOfDivision = numberOneDouble % numberTwoDouble
        println("The remainder of the division = $remainderOfDivision")
    }
    else {
        println("Error you had to enter a number")
    }
}