class Solution {
    fun majorityElement(nums: IntArray): Int {
        var answer = nums[0]
        var count = 0
        
        nums.forEach {
            count += if (it == answer) 1 else -1

            if (count == 0) {
                answer = it
                count = 1
            }
        }

        return answer
    }
}