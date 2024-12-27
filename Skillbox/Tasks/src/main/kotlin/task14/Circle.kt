package task14

class Circle(var radius:Double): Shape() {
    override fun getArea(): Double {
        return radius*radius*Math.PI
    }
}