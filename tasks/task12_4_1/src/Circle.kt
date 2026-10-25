// Task 12.4.1: Circle class
import kotlin.math.PI
import kotlin.math.pow
import kotlin.math.sqrt

class Circle(val centre: Point, val radius: Double) {

    init {
        require(radius > 0) {"Radius must be positive"}
    }

    fun area(): Double {
        return PI * radius.pow(2)
    }

    fun perimeter(): Double {
        return 2 * PI * radius
    }

    fun contains(p: Point): Boolean {

        return p.distanceTo(centre) < radius
    }

}