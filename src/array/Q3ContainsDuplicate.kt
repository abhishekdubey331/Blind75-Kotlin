package array

/***
 *
 * 217. Contains Duplicate
 * Given an integer array nums, return true if any value appears at least twice in the array,
 * and return false if every element is distinct.
 *
 *
 */
fun containsDuplicate(array: IntArray): Boolean {
    val set = mutableSetOf<Int>()
    for (num in array) {
        val added = set.add(num)
        if (added.not()) {
            return true
        }
    }
    return false
}

fun main() {
    val array = intArrayOf(1, 2, 3, 1)
    val result = containsDuplicate(array)
    println("Does array contains duplicate: $result")
}