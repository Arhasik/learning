//Создайте функцию sum, которая принимает два целых числа и возвращает их сумму.
fun main() {
    println("Enter number first")
    val a = readLine()!!.toInt()
    println("Enter number second")
    val b = readLine()!!.toInt()
    println("Amount - ${sum(a=a, b=b)}")
}
fun sum(a: Int, b: Int): Int {
    return a + b
}