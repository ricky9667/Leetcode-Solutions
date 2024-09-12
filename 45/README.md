# [45. Jump Game II](https://leetcode.com/problems/jump-game-ii/)

- Problem List: [Top Interview 150](https://leetcode.com/studyplan/top-interview-150/)
- Solved: Sep 12, 2024

## Solution

從頭開始迭代 `nums`，迭代每個數字時去尋找 **「跳到目前的 index 最少需要 Jump 幾次」**，並紀錄至 `steps[i]`。

尋找「跳到目前的 index 最少需要 Jump 幾次」時，用一個迴圈去看每一個 `0` ~ `i-1` 裡面 **「能跳到 i 的位置中， `steps[i]` 最小的 index」**， `i` 為上面提到迭代每個數字時目前的 index。

最後回傳 `steps` 中的最後一個數字即為答案。

以下 example 的 `position[i]` 為每個 index 可以跳到的最大 index，後來都被直接簡化成 i + nums[i] 不存在陣列中。

### Example 1

| `i` | `nums[i]` | `steps[i]` | `position[i] = i + nums[i]` |
| --- | --------- | ---------- | ----------- |
|   0 |         2 |          0 |           2 |
|   1 |         3 |          1 |           4 |
|   2 |         1 |          1 |           3 |
|   3 |         1 |          2 |           4 |
|   4 |         4 |          2 |           4 |

### Example 2

| `i` | `nums[i]` | `steps[i]` | `position[i] = i + nums[i]` |
| --- | --------- | ---------- | ----------- |
|   0 |         2 |          0 |           2 |
|   1 |         3 |          1 |           4 |
|   2 |         0 |          1 |           2 |
|   3 |         1 |          2 |           4 |
|   4 |         4 |          2 |           4 |
