package array

/**
 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.
 *
 * You may assume that each input would have exactly one solution, and you may not use the same element twice.
 *
 * You can return the answer in any order.
 *
 * Example 1:
 *
 * Input: array = [2,7,11,15], target = 9
 * Output: [0,1]
 * Explanation: Because array[0] + array[1] == 9, we return [0, 1].
 */
fun twoSum(array: IntArray, target: Int): Pair<Int, Int> {
    val map = mutableMapOf<Int, Int>()
    for (i in array.indices) {
        val expectedNum = target - array[i]
        if (map.containsKey(expectedNum)) {
            return Pair(map[expectedNum] ?: -1, i)
        }
        map[array[i]] = i
    }
    return Pair(-1, -1)
}

fun main() {
    val result = twoSum(intArrayOf(2, 7, 11, 15), 9)
    println("The index of the nums for sum are: ${result.first} and ${result.second}")
}
