//Создайте функцию containsElement, которая принимает список целых чисел и элемент,
//и возвращает true, если элемент содержится в списке, и false в противном случае.
fun main() {
    val list = listOf<Int>(1,2,3,4,5,7,8,4,43,4,37,4768,67)
    val elementFirst = 4
    val elementSecond = 365
    println("The item is contained in the list - ${containsElement(list=list,element=elementFirst)}")
    println("The item is contained in the list - ${containsElement(list=list,element=elementSecond)}")

}
fun containsElement (list: List<Int>, element:Int):Boolean {
    for (x in list) {
        if (x==element) {
            return true
        }
    }
    return false
}