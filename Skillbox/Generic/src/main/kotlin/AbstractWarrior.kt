abstract class AbstractWarrior(
    private val maxHealth: Int,
    private val accuracy: Int,
    override val dodgeChance: Int,
    private val weapon: AbstractWeapon
) : Warrior {
    var currentHealth = maxHealth
    override var isKilled: Boolean = false
        set(value) {
            if (value && !field) { // Умирает только один раз
                field = true
                currentHealth = 0
                println("${this.javaClass.simpleName} Dead!")
            }
        }


    override fun attack(opponent: Warrior) {
        if (weapon.isEmpty) {
            println("Weapon is empty! Reload...")
            weapon.reload()
            if (weapon.isEmpty) {
                println("Couldn't reload weapon!")
                return
            } else {
                attack(opponent) // Попробуйте атаковать снова
                return
            }
        }
        val ammo = weapon.getAmmoForFire()
        println("Use ammo: ${ammo.size}")

        val totalDamage = ammo.filter {
            val hit = accuracy.randomChance()
            println("Accuracy check ($accuracy%): $hit")
            if (hit) {
                val dodge = opponent.dodgeChance.randomChance()
                println("Dodge opponent: $dodge")
                !dodge
            } else {
                false
            }
        }.sumOf { it.calculateDamage() }

        println("Damage done $totalDamage")
        opponent.getDamage(totalDamage)
    }

    override fun getDamage(damage: Int) {
        if (damage > 0) {
            currentHealth -= damage
            println(" ${this.javaClass.simpleName} get damage $damage, current health: $currentHealth")
            if (currentHealth < 0) currentHealth = 0 // Не уходим в минус
            if (currentHealth == 0) {
                isKilled = true
                println(" ${this.javaClass.simpleName} Dead!")
            }
        }
    }
}

