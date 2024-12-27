package task14

class Rectangle(var width: Double, var height: Double): Shape() {
    override fun getArea(): Double {
        return width*height
    }

}