// Task 5.1.1: main program

fun main(args: Array<String>) {
    if (args.size != 2) {
        println("Usage: anagram1, anagram2")
        return
    }
    if (anagrams(args[0], args[1])) {
        println("The words are anagrams")
    }
    else {
        println("The words are not anagrams")
    }
}