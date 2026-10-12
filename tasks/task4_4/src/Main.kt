// Task 4.4: temperature conversion using a while loop

import kotlin.system.exitProcess

import com.github.ajalt.mordant.rendering.AnsiLevel
import com.github.ajalt.mordant.rendering.TextAlign
import com.github.ajalt.mordant.rendering.TextColors.*
import com.github.ajalt.mordant.table.table
import com.github.ajalt.mordant.terminal.Terminal

fun main(args: Array<String>) {
    // Add your code here
    if (args.size != 3) {
        println("Usage: <initial> <max> <increment>")
        exitProcess(1)
    }

    val temp_init = args[0].toDouble()
    val temp_max = args[1].toDouble()
    val temp_increm = args[2].toDouble()
    

    var temp = temp_init

    while (temp <= temp_max) {
        val temp_Fahr = temp * 9.0 / 5.0  + 32.0 
        println("%6.1f %6.1f".format(temp, temp_Fahr))
        temp += temp_increm
    }

}
