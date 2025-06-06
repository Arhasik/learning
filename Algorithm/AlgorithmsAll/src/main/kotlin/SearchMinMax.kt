fun main () {
    println("Task 1: ${task1()}")
    println("Task 2: ${task2()}")
    println("Task 3: ${task3()}")
    println("Task 4: ${task4()}")


}

fun task1 (): Int {
//    Наша функция поиска максимального элемента содержит небольшую ошибку,
//    и не поддерживает нахождение максимального элемента в массиве из отрицательных чисел.
//    Например если нам нужно найти самое “маленькое” списание денег в банковской выписке.
//    Сможете поправить?
//    Верните `int` размер списания.
//    *Например*
//    find_smallest_transaction([-1392, -1920, -7, -453, -91234])  # => -7

    val array = arrayOf(-1392, -1920, -7, -453, -91234)
    var max = Integer.MIN_VALUE
    for (i in array.indices) {
        if (array[i] > max) {
            max = array[i]
        }
    }
    return  max
}

fun task2 (): Int {
//    Дан массив с количеством ошибок, которое совершили студенты Skillbox в предыдущем ДЗ.
//    Сколько ошибок совершил максимально внимательный и аккуратный студент?
//    Верните `int` кол-во ошибок.
//    *Например*
//    find_best_student_mistakes([9, 4,1, 8, 7,13, 6, 5])  # => 1

    val array = arrayOf(9, 4,1, 8, 7,13, 6, 5)
    var min = Integer.MAX_VALUE
    for (i in array.indices) {
        if (array[i] < min) {
            min = array[i]
        }
    }
    return min
}


fun task3(): Float {
//    Мы опросили несколько миллиардов студентов Skillbox чтобы узнать сколько времени они
//    тратят каждый день на изучение материалов курса.
//    Оказалось что это где-то в диапазоне от 3 до 18 секунд каждый день!
//    Однако наш штатный Data Scientist не смог ответить на вопрос,
//    сколько в среднем студент тратит времени в день.
//    Используйте переменную “аккумулятор”,
//    и цикл for чтобы найти среднее значение в массиве целых чисел.
//    Верните `float` среднее время.
//    *Например*
//    ```python
//    find_average_time([9, 4,1, 8, 7,9, 4,1, 8, 7, 8, 7, 18, 3, 13, 6, 5])  # => 6.94
    val array = arrayOf(9, 4, 1, 8, 7, 9, 4, 1, 8, 7, 8, 7, 18, 3, 13, 6, 5)
    var accumulator = 0.0f
    var iterationCount = 0

    for (i in array.indices) {
        accumulator += array[i]
        iterationCount += 1
    }

    return (accumulator / iterationCount)
}


fun task4(): Int {
//    Фрилансер Геннадий много работает с разными заказчиками,
//    делая для них сайты и мобильные приложения.
//    Каждый день Гена все свое рабочее время посвящает только одному из своих заказчиков,
//    и за каждый день получает разную оплату.
//    В конце дня он записывает доход в двумерный массив у себя в голове:
//    там для каждого из заказчиков есть массив с доходами (в долларах) в день.
//    (Обратите внимание — что доходы бывают и отрицательными,
//    иногда заказчики штрафуют Гену за сорванные сроки)
//    *Например*
//    income = [
//        [95, 67, 13, 55, 44, 11, 10],  # Доходы от первого заказчика
//    [7,190, 4, 44, 11, 1, 99],     # Доходы от второго заказчика
//    [0, 5, -1, 500, 14, 90, 1],    # Доходы от третьего заказчика
//    ]
//    Но дальше так продолжаться не может,
//    и Гена решает дальше работать всегда только с одним из заказчиков.
//    Помогите Гене решить какой из заказчиков самый выгодный в пересчете на дневной доход,
//    и с которым он в долгосрочной перспективе заработает больше денег.
//    find_most_profitable_client(income)  # => 2,
//    получается третий заказчик (индекс 2) самый выгодный
//    Верните `int` индекс самого выгодного заказчика.

    val array = arrayOf(
        arrayOf(95, 67, 13, 55, 44, 11, 10),
        arrayOf(7,190, 4, 44, 11, 1, 99),
        arrayOf(0, 5, -1, 500, 14, 90, 1)
    )
    var bestClient = 0
    var maxProfit = Int.MIN_VALUE

    for ((index, customer) in array.withIndex()) {
        var clientTotalProfit = 0

        for (j in customer) {
            clientTotalProfit += j
        }
        if (clientTotalProfit > maxProfit) {
            maxProfit = clientTotalProfit
            bestClient = index
        }
    }
    return bestClient
}




