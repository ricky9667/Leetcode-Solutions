# [27. Remove Element](https://leetcode.com/problems/remove-element/)

- Problem List: [Top Interview 150](https://leetcode.com/studyplan/top-interview-150/)
- Solved: Jul 20, 2024

## Solution

### Implementation

```kotlin
class Solution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        val result = mutableListOf<Int>()
        
        // Add elements to `result` when != `val`
        for (i in 0 until nums.size) {
            if (nums[i] != `val`) {
                result.add(nums[i])
            }
        }

        // Copy back to `result`
        for (i in 0 until result.size) {
            nums[i] = result[i]
        }

        return result.size
    }
}
```
