# [55. Jump Game](https://leetcode.com/problems/jump-game/)

- Problem List: [Top Interview 150](https://leetcode.com/studyplan/top-interview-150/)
- Solved: Aug 9, 2024

## Solution

## Implementation

```kotlin
class Solution {
    fun canJump(nums: IntArray): Boolean {
        var maxIndex = 0
        var index = 0

        while (index <= maxIndex && index < nums.lastIndex) {
            if (index + nums[index] > maxIndex) {
                maxIndex = index + nums[index]
            }
            index++
        }

        return maxIndex >= nums.lastIndex
    }
}
```
