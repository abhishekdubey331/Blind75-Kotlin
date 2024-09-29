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
fun twoSum(array: IntArray, target: Int): IntArray {
    // First create a HashMap
    val map = HashMap<Int, Int>()
    // Iterate through the array
    array.forEachIndexed { index, value ->
        // Check the diff here
        // example diff = 9 -2 = 7
        val diff = target - value
        // Check diff is present or not
        // example map does not have 7 key on it
        if (map.containsKey(diff)) {
            // If it contains, return the value of the key and index of the loop
            return intArrayOf(map[diff]!!, index)
        }
        // If diff is not present on the map
        // Put the value and index on the map
        map[value] = index
    }
    return intArrayOf()
}
