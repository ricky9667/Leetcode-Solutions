# [169. Majority Element](https://leetcode.com/problems/majority-element/)

- Problem List: [Top Interview 150](https://leetcode.com/studyplan/top-interview-150/)
- Solved: Jul 25, 2024

## Solution

使用 Moore's Voting Algorithm (戰鬥法)，可以達到空間複雜度只有 O(1)。
**刪去數列中兩個不同的數字，不會影響該數列的 Majority element。**

- 如果現在的數字等於 `ans`，`count` 增加 1。
- 如果現在的數字不等於 `ans`，`count` 減少 1。
- 上面的計算後如果 `count` 歸零，表示目前看到的數字被另一個出現更多次的數字抵銷，因此把 `ans` 新的數字，`count` 重新從 1 開始算。

### Example 1

```text=
Input: nums = [3,2,3]
Output: 3
```

| num | ans | count | note |
| --- | --- | ----- | ---- |
|   3 |   3 |     1 | 數字相同 count + 1 |
|   2 |   2 |     1 | 數字不同 count - 1 = 0 -> 從 1 開始 |
|   3 |   3 |     1 | 數字不同 count - 1 = 0 -> 從 1 開始 |

### Example 2

```text=
Input: nums = [2,2,1,1,1,2,2]
Output: 2

```

| num | ans | count | note |
| --- | --- | ----- | ---- |
|   2 |   2 |     1 | 數字相同 count + 1 |
|   2 |   2 |     2 | 數字相同 count + 1 |
|   1 |   2 |     1 | 數字不同 count - 1 |
|   1 |   1 |     1 | 數字不同 count - 1 = 0 -> 從 1 開始 |
|   1 |   1 |     2 | 數字相同 count + 1 |
|   2 |   1 |     1 | 數字不同 count - 1 |
|   2 |   2 |     1 | 數字不同 count - 1 = 0 -> 從 1 開始 |