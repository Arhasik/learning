import kotlin.random.Random

fun main() {
    val team1 = Team(1)
    val team2 = Team(1)

    val battle = Battle(team1, team2)
    var iterationCount = 0
    val maxIterations = 1000 // Ограничение на количество итераций

    while (battle.getBattleState() is BattleState.Progress && iterationCount < maxIterations) {
        battle.iterationBattle()
        iterationCount++
    }

    if (iterationCount >= maxIterations) {
        println("Battle reached maximum iterations without a winner.")
    }
}

private val random = Random(System.currentTimeMillis())
fun Int.randomChance(): Boolean {
    val result = random.nextInt(100) < this
    println("The chance worked: $result with the value $this")
    return result
}