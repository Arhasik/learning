//Напишите функцию, которая принимает список строк и возвращает новый список,
//отсортированный в алфавитном порядке.
fun main() {
    val list = mutableListOf<String >("bsdf", "asdmv", "pojkn", "werwe","fdg")
println(sortStrings(list))
    println(sortStringsTrouble(list))
    println(sortStringFunction(list))
}
fun sortStrings(list: MutableList<String>): List<String> {

    var sorted = false
    while (!sorted) {
        sorted = true
        for (i in 1 until list.size) {
            val previous = list[i-1]
            val current = list[i]
            if(previous > current) {
                swap(list,i-1, i)
                sorted = false
            }
        }
    }
    return list // Возвращаем отсортированный список
}

fun swap(list:MutableList<String>, indexFirst: Int, indexTwo: Int ) {
    val buffer = list[indexFirst]
    list[indexFirst] = list[indexTwo]
    list[indexTwo] = buffer
}



fun sortStringsTrouble(sortedList: MutableList<String>): List<String> {
for (i in 0 until sortedList.size - 1) {
    for (j in 0 until sortedList.size - i - 1) {
        if (sortedList[j] > sortedList[j + 1]) {
            val temp = sortedList[j]
            sortedList[j] = sortedList[j + 1]
            sortedList[j + 1] = temp
        }
    }
}

return sortedList
}

fun sortStringFunction (list: MutableList<String>): List<String> {
   return list.sorted()
}
