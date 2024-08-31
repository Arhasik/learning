//Напишите функцию, которая принимает список строк и лямбда-выражение
//для объединения всех строк в одну с помощью определенного разделителя. Например, объединение с разделителем ", ".
fun main() {
    val list = listOf("apple", "banana", "cherry")
    println(list)
    val lambda = unification(list,{it})
    println(lambda)
}
fun unification (list: List <String>, lambda: (String) -> String): String {
    return list.joinToString(",        ")
}