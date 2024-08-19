//Периметр и площадь прямоугольника:
//Напишите программу, которая принимает длину и ширину прямоугольника, а затем вычисляет и выводит его периметр и площадь.
fun main() {
    println("Enter first number - width")
    val numberOneWidth: String? = readLine()
    println("Enter second number - Length")
    val numberTwoLength: String? = readLine()
    if ((numberOneWidth?.matches("""\d+""".toRegex()) == true && numberTwoLength?.matches("""\d+""".toRegex()) == true) )
    {
        val numberOneDouble: Double = numberOneWidth.toDouble()
        val numberTwoDouble: Double = numberTwoLength.toDouble()
        val perimeter: Double = numberOneDouble * 2 + numberTwoDouble * 2
        val square = numberOneDouble * numberTwoDouble
        println("The square = $square, the perimeter = $perimeter", )
    }
    else {
        println("Error you had to enter a number")
    }
}