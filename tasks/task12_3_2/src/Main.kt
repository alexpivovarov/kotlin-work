// Task 12.3.2: demo of Person class with secondary constructor
import kotlinx.datetime.LocalDate

fun main() {
    val x = Person("John", "2009-09-29")
    println(x.name)
    println(x.birth)
    println(x.isMarried)
}