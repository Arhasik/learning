import java.util.Objects

object Weapons {

    fun createPistol (): AbstractWeapon { return object: AbstractWeapon(7, FireType.SingleShot) {
        override fun createAmmo() = Ammo.LIGHT
    }
    }



    fun createRifle () = object: AbstractWeapon (30,FireType.Burst(10)) {
        override fun createAmmo(): Ammo {
            return Ammo.MEDIUM
        }
    }

    fun createMachinePistol () = object: AbstractWeapon (15,FireType.Burst(3)) {
        override fun createAmmo(): Ammo {
            return Ammo.LIGHT
        }
    }

    fun createSniperRifle () = object: AbstractWeapon (5,FireType.SingleShot) {
        override fun createAmmo(): Ammo {
            return Ammo.HARD
        }
    }





}
