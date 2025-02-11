import kotlinx.coroutines.cancel
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.runBlocking

fun main() {
    runBlocking {

        val flowNumberKeg = Leader.lotoNumbers().shareIn(this, SharingStarted.Lazily, replay = 0)
        val winnerFlow = MutableStateFlow(false)

        val players = listOf(
            Player("Игрок 1",2),
            Player("Игрок 2",1),
            Player("Игрок 3",1)
        )

        val jobs = players.map { it.play(flowNumberKeg, winnerFlow) }

        winnerFlow.collect { hasWinner ->
            if (hasWinner) {
                println("Игра завершена!")
                jobs.forEach { it.cancel() }
                cancel()
            }

        }
    }
}