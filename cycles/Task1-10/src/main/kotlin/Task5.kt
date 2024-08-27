//Напишите программу, которая запрашивает у пользователя целое положительное число n и с помощью цикла while проверяет,
//является ли оно простым (то есть делится только на 1 и на само себя).
//Если число простое, выведите сообщение "Число простое", иначе - "Число не является простым".
fun main() {
    do {
        println("Enter number")
        val n = readLine()!!.toInt()
        println(n)
        val boolean = n > 1 && n==2 || n == 3 || n == 5 || n == 7
        val boolean1 = n > 1 && n % 2 !== 0 && n % 3 !== 0 && n % 5 !== 0 && n % 7 !== 0
        println(boolean)
        println(boolean1)
        if (boolean) {
            println("the number is simple")
        }
        else if  (boolean1) {
            println("the number is simple")
        }
        else {
            println("the number is not simple")

        }
    } while (!boolean && !boolean1)
}
