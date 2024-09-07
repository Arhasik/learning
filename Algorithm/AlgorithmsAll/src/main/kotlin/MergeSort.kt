fun main () {



    var array1 = listOf<Int>(1,5,3,7,9,5).sorted()
    var array2 = listOf<Int>(2,8,10,6,4).sorted()

    var array1Length = array1.size
    var array2Length = array2.size

    var sizeArray = array1Length + array2Length

    var index1 = 0
    var index2 = 0


    var arrayEmpty = MutableList<Int>(sizeArray){0}


for (i in 0 until sizeArray) {
    if (index1 < array1Length && (index2 >= array2Length || array1[index1] < array2[index2])) {
        arrayEmpty[i] += array1[index1]
        index1 ++
    }
    else {
        arrayEmpty[i] += array2[index2]
        index2 ++
    }
}
    println(arrayEmpty.toList())
}
