import kotlinx.coroutines.delay
import kotlinx.coroutines.yield
import java.math.BigInteger

object Fibonacci {
    suspend fun take (n: Int): BigInteger {
        if (n < 0) throw IllegalArgumentException("The number must be non-negative ")
        var numberFirst = 1
        var numberSecond = 1
        var nextNumber = 0
        for (i in 0..1000) {
            delay(100)
            yield()
            nextNumber = numberFirst + numberSecond
            numberFirst = numberSecond
            numberSecond = nextNumber
            if (i == n-3) {
                break
            }
        }
        return  numberFirst.toBigInteger()
    }
}