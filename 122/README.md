# [122. Best Time to Buy and Sell Stock II](https://leetcode.com/problems/best-time-to-buy-and-sell-stock-ii/)

- Problem List: [Top Interview 150](https://leetcode.com/studyplan/top-interview-150/)
- Solved: Aug 4, 2024

## Solution 1

使用貪婪演算法 (Greedy)，在迭代整個 Array 過程中，

1. 如果數字 `prices[i]` 小於 `prices[i-1]` ，更新 `lowestPrice`。
2. 如果數字 `prices[i]` 大於 `prices[i-1]` ，將目前和 `lowestPrice` 的差加進 `maxProfit`，並更新 `lowestPrice`。

### Example

| `i` | `prices[i]` | `lowestPrice` | `maxProfit` |
| --- | ----------- | ------------- | ----------- |
|   0 |           7 |             7 |           0 |
|   1 |           1 |             1 |           0 |
|   2 |           5 |             5 | 0 + (5 - 1) = 4 |
|   3 |           3 |             3 |           4 |
|   4 |           6 |             6 | 4 + (6 - 3) = 7 |
|   5 |           4 |             4 |           7 |

## Solution 2

以上的 Greedy 可以進行常數優化。

先將 `prices` 進行差分運算，計算出相鄰兩個數字 `prices[i]` 和 `prices[i-1]` 相減後，將相差 > 0 的值相加即為解答。

### Example

- 輸入：`[7, 1, 5, 3, 6, 4]`
- 進行差分計算：`[-6, 4, -2, 3, -2]`
- 把數值為正相加：`4 + 3 = 7`