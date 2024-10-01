# [58. Length of Last Word](https://leetcode.com/problems/length-of-last-word/)

- Problem List: [Top Interview 150](https://leetcode.com/studyplan/top-interview-150/)
- Solved: Oct 1, 2024

## Implementation

```kotlin
class Solution {
    fun lengthOfLastWord(s: String): Int {
        var index = s.lastIndex
        var endIndex = -1

        while (index >= 0) {
            if (endIndex == -1) {
                if (s[index] != ' ') endIndex = index 
            } else {
                if (s[index] == ' ') break
            }
            index--
        }

        return endIndex - index
    }
}
```
