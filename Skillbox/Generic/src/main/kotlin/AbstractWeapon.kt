abstract class AbstractWeapon (
    private  val maxAmmo: Int,
    private  val fireType: FireType,
        ) {
    private var ammoStack = Stack<Ammo>()
    val isEmpty: Boolean get() = ammoStack.isEmpty()

    abstract fun createAmmo (): Ammo
    fun reload () {
        ammoStack.listStack.clear()
        repeat(maxAmmo) {
            ammoStack.push(createAmmo())
        }
    }

    fun getAmmoForFire(): List<Ammo> {
        return when (fireType) {
            is FireType.SingleShot -> listOfNotNull(ammoStack.pop())
            is FireType.Burst -> List(fireType.burst) { ammoStack.pop() }.filterNotNull()
        }
    }

}