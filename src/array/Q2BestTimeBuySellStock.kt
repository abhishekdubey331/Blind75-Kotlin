package array

import kotlin.math.max
import kotlin.math.min

fun bestTimeBuySellStock(pricesArray: IntArray): Int {
    var min = pricesArray.first()
    var maxProfit = Int.MIN_VALUE

    for (i in pricesArray.indices) {
        min = min(min, pricesArray[i])
        maxProfit = max(maxProfit, pricesArray[i] - min)
    }
    return maxProfit
}

fun main() {
    val result = bestTimeBuySellStock(intArrayOf(7, 10, 1, 3, 6, 9, 2))
    println("Max profit we can get is: $result")
}
