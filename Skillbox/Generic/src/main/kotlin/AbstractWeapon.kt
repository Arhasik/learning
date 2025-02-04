abstract class AbstractWeapon (
    private val maxAmmo: Int,
    private val fireType: FireType,
        ) {
    private var ammoStack = Stack<Ammo>()
    val isEmpty: Boolean get () = ammoStack.isEmpty()

    abstract fun createAmmo (): Ammo
    fun reload() {
        println("Start reload...")
        val neededAmmo = maxAmmo - ammoStack.size()
        repeat(neededAmmo) {
            val ammo = createAmmo()
            println("Create ammo: $ammo")
            ammoStack.push(ammo)
        }
        println("Weapon reloaded, ammo: ${ammoStack.size()}")
    }

    fun getAmmoForFire(): List<Ammo> {
        if (isEmpty) {
            println("Stack ammo is empty, no ammo for shoot!")
            return emptyList()
        }
        val ammoFired = when (fireType) {
            is FireType.SingleShot -> if (!isEmpty) listOf(ammoStack.pop()!!) else emptyList()
            is FireType.Burst -> List(fireType.burst) { if (!isEmpty) ammoStack.pop()!! else null }.filterNotNull()
        }
        println("Fired ammo: ${ammoFired.size}")
        return ammoFired
    }


}