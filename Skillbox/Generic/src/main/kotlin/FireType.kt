sealed class FireType () {
    object SingleShot: FireType()  {
    }
    data class Burst (var burst: Int): FireType ()
}
