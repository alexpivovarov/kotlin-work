import kotlin.math.sqrt
import kotlin.system.exitProcess


typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here


fun isValidTriangle(triangle: Triangle): Boolean {
    val (a, b, c) = triangle

    return (a + b > c && b + c > a && c + a > b)
        
}


fun triangleArea(triangle: Triangle): Double {
    require(isValidTriangle(triangle)) { "Not a valid triangle"}
    val (a, b, c) = triangle

    val s = (a + b + c) / 2
    return sqrt(s * (s - a) * (s - b) * (s - c))
    
}

fun main(args: Array<String>) {
    if (args.size != 3) {
        println("Not a correct number of arguments")
        exitProcess(1)
    }

    val triangle = Triangle(args[0].toDouble(), args[1].toDouble(), args[2].toDouble())

    if (!isValidTriangle(triangle)) {
        println("error: not a valid triangle")
        exitProcess(1)
    }

    println("Area = %.5f".format(triangleArea(triangle)))
}