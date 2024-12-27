package task2

class Rectangle (var weight: Int, var height: Int): Shape {
    override fun area(): Double {
        val area = weight * height
        println("Area rectangle - $area")
        return area.toDouble()
    }

    override fun perimeter(): Double {
        val perimeter =  2 * (weight + height)
        println("Perimeter rectangle - $perimeter")
        return perimeter.toDouble()

    }
}