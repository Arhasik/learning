//Напишите функцию max, которая принимает два числа типа Double и возвращает большее из них.
fun main() {
    println("Enter number first")
    val a = readLine()!!.toDouble()
    println("Enter number second")
    val b = readLine()!!.toDouble()
    println("The maximum number - ${max(a=a, b=b)}")
}
fun max (a:Double, b:Double): Double {
    return if (a>b) {
        a
    }
    else {
        b
    }
}