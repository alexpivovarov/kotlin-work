// Task 4.5: summing odd integers with a for loop

import kotlin.system.exitProcess

fun main(args: Array<String>) {

    if (args.size != 1) {
        println("Usage: <number> ")
        exitProcess(1) }


        var sum = 0L
        val limit = args[0].toIntOrNull()

        if (limit == null) {
            println("Error: not a valid integer")
            exitProcess(1)
        }

    for (n in 1..limit step 2) 
        sum += n

    println(sum)
    
}
