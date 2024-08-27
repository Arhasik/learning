//Напишите программу, которая принимает год и выводит, является ли этот год високосным или нет.
//Год является високосным, если он делится на 4, но не делится на 100, за исключением годов, делящихся на 400.
fun main() {
    println("Enter year")
    val year = readLine()!!.toInt()

    if (year % 4 == 0 && year % 100 !== 0) {
println("The year is a leap year")
    }
    if (year % 400 == 0){
        println("The year is a leap year")
    }
    else {
        println("The year is not a leap year")
    }

}