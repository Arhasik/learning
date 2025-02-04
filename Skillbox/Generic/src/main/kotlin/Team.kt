
class Team (private val amountPeople: Int) {
    val warriors = List(amountPeople) {
        when {
            (10).randomChance() -> General()
            (40).randomChance() -> Captain()
            else -> Soldier()
        }
    }.toMutableList()

    val isDefeated: Boolean
        get() {
            val defeated = warriors.all { it.isKilled }
            println("isDefeated: $defeated (Life warrior: ${warriors.count { !it.isKilled }})")
            return defeated
        }}

