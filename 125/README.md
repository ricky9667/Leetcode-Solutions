# [125. Valid Palindrome](https://leetcode.com/problems/valid-palindrome/)

- Problem List: [Top Interview 150](https://leetcode.com/studyplan/top-interview-150/)
- Solved: Oct 15, 2024

## Solution

### Implementation

```kotlin
class Solution {
    fun isPalindrome(s: String): Boolean {
        var l = 0
        var r = s.lastIndex

        while (l < r) {
            while (!s[l].isLetter() && !s[l].isDigit()) {
                if (l == r) break
                l++
            }

            while (!s[r].isLetter() && !s[r].isDigit()) {
                if (l == r) break
                r--
            }

            if (s[l].lowercaseChar() != s[r].lowercaseChar()) return false

            l++
            r--
        }

        return true
    }
}
```
