// Task 4.2: use of if and ranges
import kotlin.system.exitProcess

fun main() {
    // Add your code here
    println("The 4 pizza options are: a, b, c, d")

    val choice =readln().lowercase()

    val message = if (choice.length == 1 && choice[0] in 'a'..'d') {
        "Order accepted"
    } else {
        "Invalid choice"
    }

    println(message)

}









