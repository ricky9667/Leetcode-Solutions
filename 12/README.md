# [12. Integer To Roman](https://leetcode.com/problems/integer-to-roman/)

- Problem List: [Top Interview 150](https://leetcode.com/studyplan/top-interview-150/)
- Solved: Oct 7, 2024

## Solution 1

來自過去自己的 Submission。

### Implementation

```kotlin
class Solution {
    fun intToRoman(num: Int): String {
        val romans = "IVXLCDM"
        var x = num
        var result = ""
        var r = 0

        while (x > 0) {
            val digit = x % 10
            when (digit) {
                9 -> result += "${romans[r+2]}" + "${romans[r]}"
                in 5..8 -> result += "${romans[r]}".repeat(digit - 5) + "${romans[r+1]}"
                4 -> result += "${romans[r+1]}" + "${romans[r]}"
                else -> result += "${romans[r]}".repeat(digit)
            }
            r += 2
            x /= 10
        }
        
        return result.reversed()
    }
}
```

## Solution 2

來自 Leetcode 上面的 Solution。

### Implementation

```kotlin
class Solution {
    fun intToRoman(num: Int): String {
        val romanMap = mapOf(
            1000 to "M",
            900 to "CM",
            500 to "D",
            400 to "CD",
            100 to "C",
            90 to "XC",
            50 to "L",
            40 to "XL",
            10 to "X",
            9 to "IX",
            5 to "V",
            4 to "IV",
            1 to "I"
        )
        val nums = romanMap.keys.toList()
        var x = num
        var result = ""

        for (n in nums) {
            while (n <= x) {
                result += romanMap[n]
                x -= n
            }
        }

        return result
    }
}
```
