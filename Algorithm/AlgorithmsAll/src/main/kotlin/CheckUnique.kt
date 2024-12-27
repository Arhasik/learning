fun main () {
    println(task11())
    println(task12())



}

fun task11 (): String {

//    Первоклассница Юля весь день тренировала начертание символов русского алфавита в прописи.
//    В конце дня мама Юли посмотрела в тетрадь и все что она там увидела было слово
//    `“АААФФФФФФФЖЫЫЫЫБЫРВАААААЛГГГХЫХЫБЛИА”`.
//    Выведите список букв, написание которых Юля выучила за день.
//    def letters_learned_today(word: str) -> str:
    val text = "АААФФФФФФФЖЫЫЫЫБЫРВАААААЛГГГХЫХЫБЛИА"
    var uniqueText = ""
    for (char in text) {
        var alreadyThere = false
        for (charUnique in uniqueText ) {
            if (char == charUnique) {
                alreadyThere = true
            }
        }
        if (!alreadyThere) {
            uniqueText += "$char"
        }
    }
    val letterCount = mutableMapOf<Char, Int>()
    for (char in text) {
        letterCount[char] = letterCount.getOrDefault(char, 0) + 1

    }
    val learnedLetters = letterCount.keys.toList()

    println(learnedLetters)
    return uniqueText
}


fun task12 (): Int {
//    Старший бухгалтер Вероника Павловна, как обычно в конце квартала,
//    подделывала финансовый отчет, чтобы ООО “Серый Оффшор”,
//    в котором она работала, могло избежать уплаты некоторых налогов.
//    Она открыла Excel и составила таблицу выплат в которой были все выплаты всем поставщикам.
//    Вероника знала что налоговая инспекция обязательно придерется к этой таблице,
//    если в ней хотя бы одна выплата повторялась (даже если выплата была разным поставщикам).
//    report = [
//        [12391203, 3828382, 334934939],
//        [45345345, 5341312, 55345345],
//        [334934939, 1234122, 657657],
//    ]
//    Помогите Гендиректору *ООО “Серый Оффшор”* избежать уголовного преследования: проверьте,
//    чтобы в таблице (двумерном массиве) были только уникальные записи.
//    def avoid_jail_due_to_tax_fraud(report: List[List[int]]) -> int:
//    Если записи не уникальны — верните первую первую сумму, которая повторяется.
//    Если же они уникальны — верните -1.
//    Известно что у компании было N поставщиков (и в таблице N столбцов),
//    и каждому было сделано X выплат (и в таблице X строчек).
//    avoid_jail_due_to_tax_fraud(report)  # => 334934939
//    Как время выполнения алгоритма зависит от X и N ?
    var list = mutableListOf<MutableList<Int>>(
        mutableListOf(12391203, 3828382, 334934939),
        mutableListOf(45345345, 5341312, 55345345),
        mutableListOf(334934939, 1234122, 657657)
    )
    val emptyList = mutableListOf<Int>()
    for (row in list) {
        for (value in row) {
            var isDuplicate = false
            for (seenValue in emptyList) {
                if (seenValue == value) {
                    isDuplicate = true
                    break
                }
            }
            if (isDuplicate) {
                return value
            }
            emptyList.add(value)
        }
    }
    return -1
}