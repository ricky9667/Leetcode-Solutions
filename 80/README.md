# [80. Remove Duplicates from Sorted Array II](https://leetcode.com/problems/remove-duplicates-from-sorted-array-ii/)

Topics: `Array` `Two Pointers`

## Solution

## Implementation

```kotlin
class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        val result = mutableListOf<Int>()

        for (i in 0 until nums.size) {
            val rSize = result.size

            if (i == 0 || nums[i] > result[rSize-1]) { 
                result.add(nums[i])
            } else if (rSize < 2 || nums[i] > result[rSize-2]) {
                result.add(nums[i])
            }
        }

        for (i in 0 until result.size) {
            nums[i] = result[i]
        }

        return result.size
    }
}
```
