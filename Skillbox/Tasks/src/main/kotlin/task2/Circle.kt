package task2

import kotlin.math.pow

class Circle (var radius: Double): Shape {

    override fun area(): Double {
        val area = Math.PI * radius.pow(2.0)
        println("Area circle - $area")
        return  area
    }

    override fun perimeter(): Double {
         val perimeter =  2 * Math.PI * radius
        println("Perimeter circle - $perimeter")
        return perimeter

    }
}