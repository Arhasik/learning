import jdk.jfr.DataAmount
import kotlin.random.Random

class Cards (val amountCard: Int) {
    var card: List<MutableList<Int>> = List(3) { MutableList(9) { 0 } }

    fun createNewCard():List<MutableList<Int>> {
        for (i in 1..amountCard) {
            val keg = (1..90).chunked(10) { it.shuffled() }
            for ((index, value) in card.withIndex()) {
                val column = (0..8).shuffled()
                for ((index1, _) in value.withIndex()) {
                    card[index][index1] = keg[index1][index]
                }
                for (j in 0..3) {
                    card[index][column[j]] = 0
                }
            }
        }
        return card
    }

    fun printInfoCard () {
        card.forEach { row ->
            println(
                row.joinToString(" | ") {
                    when (it) {
                        0 -> " -"
                        -1 -> " Х"
                        else -> it.toString().padStart(2, ' ') // Выравниваем числа
                    }
                }
            )
        }
        println()
    }

    fun markNumber (number: Int ) {
        card.forEach {
                row ->
            if (number in row ) {
                row[row.indexOf(number)] = -1
            }
        }
    }

    fun checkVictory (): Boolean {
        return  card.any{ row-> row.all {it <= 0} }

    }


}




