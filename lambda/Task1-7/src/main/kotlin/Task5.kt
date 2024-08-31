//Напишите функцию, которая принимает список строк и лямбда-выражение для преобразования каждого элемента списка по заданному правилу.
//Например, добавление к каждой строке суффикса "-2023".
fun main() {
    val list = listOf("apple", "banana", "cherry")
    val lambda = transformationOfEachElement(list, {it + "-1985"})
    println(lambda)
}
fun transformationOfEachElement (list: List<String>, lambda: (String)-> String): List<String> {
    return list.map(lambda)
}