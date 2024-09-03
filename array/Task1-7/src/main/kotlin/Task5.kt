//Напишите функцию, которая принимает массив целых чисел и число, и возвращает true,
// если число присутствует в массиве, и false в противном случае.
fun main() {
    val array = arrayOf(1,2,5,4,3,6,10,12,8)
    val numberThereIs = 3
    val numberThereIsNo = 53
    println("There is number in the array - ${thereIsNumberInArray(array,numberThereIs)}")
    println("There is no number in the array - ${thereIsNumberInArray(array,numberThereIsNo)}")
    println("There is no number in the array through function - ${thereIsNumberInArrayFunction(array,numberThereIs)}")
    println("There is no number in the array through function- ${thereIsNumberInArrayFunction(array,numberThereIsNo)}")


}
fun thereIsNumberInArray (array: Array<Int>, number: Int):Boolean {
    for (i in array){
        if (i == number) {
            return true
        }
    }
    return false
}
fun thereIsNumberInArrayFunction (array: Array<Int>, number: Int):Boolean {
return array.contains(number)
}