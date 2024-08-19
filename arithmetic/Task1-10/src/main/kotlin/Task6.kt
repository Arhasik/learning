//Среднее арифметическое:
//Напишите программу, которая принимает три числа от пользователя и выводит их среднее арифметическое.
fun main() {
    println("Enter first number")
    val numberOne: String? = readLine()
    println("Enter second number")
    val numberTwo: String? = readLine()
    println("Enter third number")
    val numberThree: String? = readLine()
    if (numberOne?.matches("""\d+""".toRegex())  == true &&
        numberTwo?.matches("""\d+""".toRegex()) == true &&
        numberThree?.matches("""\d+""".toRegex()) == true)
    {
        val numberOneDouble: Double = numberOne.toDouble()
        val numberTwoDouble: Double = numberTwo.toDouble()
        val numberThreeDouble: Double = numberThree.toDouble()
        val sum = numberOneDouble + numberTwoDouble + numberThreeDouble
        val arithmeticMean = sum / 3
        println("The arithmetic mean  = $arithmeticMean")
    }
    else {
        println("Error you had to enter a number")
    }
}

