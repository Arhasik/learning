sealed class BattleState {
    class Progress(var teamOne: Team, var teamTwo: Team) : BattleState() {
//        init {
//            println("Health team one ${teamOne.warriors.sumOf { it.currentHealth }}")
//            println("Health team two ${teamTwo.warriors.sumOf { it.currentHealth }}")
//        }
    }

    object TeamOneVictory: BattleState()
    {
//        init {
//            println("Victory team one")
//        }
    }
    object TeamTwoVictory: BattleState()
    {
//        init {
//            println("Victory team two")
//        }
    }
    object Draw:BattleState() {
//        init {
//            println("Draw")
//        }
    }
}
