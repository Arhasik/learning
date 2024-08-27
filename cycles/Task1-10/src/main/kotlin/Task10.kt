
//Напишите функцию containsNumberInRange, которая принимает число target и диапазон чисел range, и возвращает true,
//если число присутствует в диапазоне, и false в противном случае. Используйте цикл for и оператор return.
fun main() {
    val target = 4
    val range = 2..10
println(containsNumberInRange(target, range))
}
fun containsNumberInRange (target:Int, range:IntRange):Boolean {
for (x in range) {
    if (target == x) {
        return true
    }
}
    return false
}