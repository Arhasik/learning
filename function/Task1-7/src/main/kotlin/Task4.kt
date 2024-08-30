//Напишите функцию factorial, которая принимает целое число n и возвращает факториал числа n.
//(Факториал числа n = n * (n-1) * ... * 1)
fun main() {
    println(factorial(5))
}
fun factorial (n:Int): Int {
    var product = 1
    for (x in 1..n) {
        product *= x
    }
    return product
}