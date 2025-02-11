import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.takeWhile
import kotlinx.coroutines.launch

class Player (val name: String, amountCard: Int ) {

    val card = Cards(amountCard = amountCard)


    fun play (flowNumberKeg: Flow<Int>, winnerFlow: MutableStateFlow<Boolean>) =

        CoroutineScope(Dispatchers.Default).launch {
            card.createNewCard()
            flowNumberKeg.takeWhile { !winnerFlow.value }.collect {
                number -> card.markNumber(number)
                println("$name get number: $number")
                card.printInfoCard()
                if (card.checkVictory()) {
                    println("$name win")
                    winnerFlow.value = true
                }
            }
        }
}