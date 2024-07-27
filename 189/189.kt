class Solution {
    fun rotate(nums: IntArray, k: Int): Unit {
        val n = nums.size
        nums.reverse(0, n)
        nums.reverse(0, k % n)
        nums.reverse(k % n, n)
    }
}
