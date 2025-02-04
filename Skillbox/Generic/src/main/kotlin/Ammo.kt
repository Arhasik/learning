
enum class Ammo (private var damage: Int, var criticalChance: Int, var criticalDamageRatio: Double) {
    LIGHT (30, 20, 1.5 ),
    MEDIUM (50, 15, 2.0),
    HARD(80, 10, 3.0);

    fun calculateDamage (): Int  {
        val isCritical = criticalChance.randomChance()
        println("Critical chance ($criticalChance%): $isCritical")
        val finalDamage = if (isCritical) (damage * criticalDamageRatio).toInt() else damage
        println("${this.name} Damage: ${finalDamage} (Critical: $isCritical)")
        return finalDamage
    }
}