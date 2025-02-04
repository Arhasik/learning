
enum class Ammo (private var damage: Int, var criticalChance: Int, var criticalDamageRatio: Double) {
    LIGHT (10, 20, 1.5 ),
    MEDIUM (20, 15, 2.0),
    HARD(40, 10, 3.0);

    fun getDamage (): Int  {
       return if (criticalChance.randomChance()) {
            (damage * criticalDamageRatio).toInt()

        } else {
            damage
        }
    }
}