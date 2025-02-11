import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.asFlow
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.runBlocking
import kotlin.random.Random

object Leader {

    fun lotoNumbers(): Flow<Int> = flow {
        val numbers = (1..90).shuffled()  // Перемешиваем бочонки
        for (number in numbers) {

            emit(number)  // Выдаём бочонок
        }
    }

}