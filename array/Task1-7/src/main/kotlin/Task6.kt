//Напишите функцию, которая принимает массив целых чисел и возвращает новый массив,
//элементы которого расположены в обратном порядке.
fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    println(array.joinToString())
    println(arrayReversed(array).joinToString())
    println(arrayReversedFunction(array).joinToString())


}
fun arrayReversed (array: Array<Int>): Array<Int?> {
    var element = array.size-1
    val arrayNew = arrayOfNulls<Int>(element+1)
    for (i in array){
        arrayNew[element] = i
        element -= 1
    }
    return arrayNew
}

fun arrayReversedFunction(array: Array<Int>): Array<Int> {
     return array.reversedArray()
}