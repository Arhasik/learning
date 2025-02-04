class Battle(
    var teamOne: Team,
    var teamTwo: Team,
) {
    var battleFinished: Boolean = false

    fun getBattleState(): BattleState {
        println("Battle state...")
        println("Team 1 life: ${!teamOne.isDefeated}, team 2 life: ${!teamTwo.isDefeated}")


        return when {
            teamOne.isDefeated && teamTwo.isDefeated -> {
                println("Draw")
                BattleState.Draw }
            teamOne.isDefeated -> {
                println("Victory team one")
                BattleState.TeamTwoVictory
            }
            teamTwo.isDefeated -> {
                println("Victory team two")
                BattleState.TeamOneVictory}
            else -> BattleState.Progress(teamOne=teamOne,teamTwo= teamTwo)
        }
    }

    private var stuckCounter = 0
    private val maxStuckIterations = 50

    fun iterationBattle() {
        if (battleFinished) return

        val teamOne1 = teamOne.warriors.shuffled()
        val teamTwo1 = teamTwo.warriors.shuffled()
        val maxPlayer = maxOf(teamOne1.size, teamTwo1.size)

        var anyDamageDealt = false

        for (i in 0 until maxPlayer) {
            val attacker = teamOne1.getOrNull(i)
            val opponent = teamTwo1.getOrNull(i)
            if (attacker?.isKilled == false && opponent?.isKilled == false) {
                val initialHP = opponent.currentHealth
                attacker.attack(opponent)
                if (opponent.currentHealth < initialHP) anyDamageDealt = true
            }
        }

        if (!anyDamageDealt) {
            stuckCounter++
            if (stuckCounter >= maxStuckIterations) {
                println("⚠ Бой застрял, останавливаем!")
                battleFinished = true
                return
            }
        } else {
            stuckCounter = 0
        }

        if (getBattleState() !is BattleState.Progress) battleFinished = true
    }
}