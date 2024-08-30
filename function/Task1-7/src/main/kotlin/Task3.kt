//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun main() {
    println("Enter number")
    val a = readLine()!!.toInt()
    println("Is even - ${isEven(a=a)}")
}
fun isEven (a:Int):Boolean {
    return a % 2 == 0

}