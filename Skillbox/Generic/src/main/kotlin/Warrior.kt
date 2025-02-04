interface Warrior {
    var isKilled: Boolean

    val dodgeChance: Int

    fun attack (opponent: Warrior)

    fun getDamage (damage: Int)

}