// Task 7.7.1: statistics functions
fun median(list: List<Float>): Float {
    require(list.isNotEmpty()) 

    val sorted = list.sorted()
    val n = sorted.size

    if (n % 2 == 0) {
        return (sorted[n/2] + sorted[n/2 - 1]) / 2
    } else {
        return sorted[n/2]
    }

}