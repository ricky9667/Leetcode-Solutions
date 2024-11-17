# [36. Valid Sudoku](https://leetcode.com/problems/valid-sudoku/)

Topics: `Array` `Hash Table` `Matrix`

## Solution

### Implementation

```kotlin
class Solution {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        for (i in 0 until 9) {
            val set = mutableSetOf<Char>()
            for (j in 0 until 9) {
                if (board[i][j] == '.') continue
                if (set.contains(board[i][j])) return false
                set.add(board[i][j])
            }
        }

        for (j in 0 until 9) {
            val set = mutableSetOf<Char>()
            for (i in 0 until 9) {
                if (board[i][j] == '.') continue
                if (set.contains(board[i][j])) return false
                set.add(board[i][j])
            }
        }

        for (x in 0 until 9 step 3) {
            for (y in 0 until 9 step 3) {
                val set = mutableSetOf<Char>()
                for (i in x until x + 3) {
                    for (j in y until y + 3) {
                        if (board[i][j] == '.') continue
                        if (set.contains(board[i][j])) return false
                        set.add(board[i][j])
                    }
                }
            }
        }

        return true
    }
}
```
