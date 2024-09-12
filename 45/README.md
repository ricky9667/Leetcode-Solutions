# [45. Jump Game II](https://leetcode.com/problems/jump-game-ii/)

- Problem List: [Top Interview 150](https://leetcode.com/studyplan/top-interview-150/)
- Solved: Sep 12, 2024

## Solution 1

使用動態規劃 Dynamic Programming，從頭開始迭代 `nums`，迭代每個數字時去尋找 **「跳到目前的 index 最少需要 Jump 幾次」**，並紀錄至 `steps[i]`。

尋找「跳到目前的 index 最少需要 Jump 幾次」時，用一個迴圈去看每一個 `0` ~ `i-1` 裡面 **「能跳到 i 的位置中， `steps[i]` 最小的 index」**， `i` 為上面提到迭代每個數字時目前的 index。

最後回傳 `steps` 中的最後一個數字即為答案， **複雜度為 O(n^2)**。

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

## Solution 2

使用貪婪演算法 Greedy。`currentJumpIndex` 代表跳 `jumps` 次最遠可以跳到的位置，`targetJumpIndex` 代表跳 `jumps + 1` 次最遠可以跳到的位置。

以目前的 `jumps` 看下一個跳的位置最遠可以到哪，如果能比 `targetJumpIndex` 更遠就把更新這個值。
如果 `i` > `currentJumpIndex` 就代表 `currentJumpIndex` 能看的下一步都看完了。
開始看下一個可以跳的位置，也就是 `jump + 1` 的位置，因此把 `jump++`、`currentJumpIndex` 換成 `targetJumpIndex`。

因為 `currentJumpIndex` 最後結束的位置就是 `nums` 的最後一個 index，因此回傳 `jumps` 為解答，**複雜度為 O(n)**。

### Example 1

| `nums` | `jumps` | `currentJumpIndex` | `targetJumpIndex` |
|---|---|---|---|
| 2 | 0 | 0 | 2 |
| 3 | 1 | 2 | 4 |
| 1 | 1 | 2 | 4 |
| 1 | 2 | 4 | 4 |
| 4 | **2** | 4 | - |

### Example 2

| `nums` | `jumps` | `currentJumpIndex` | `targetJumpIndex` |
|---|---|---|---|
| 2 | 0 | 0 | 2 |
| 3 | 1 | 2 | 4 |
| 0 | 1 | 2 | 4 |
| 1 | 2 | 4 | 4 |
| 4 | **2** | 4 | - |

### Example 3

| `nums` | `jumps` | `currentJumpIndex` | `targetJumpIndex` |
|---|---|---|---|
| 1 | 0 | 0 | 1 |
| 1 | 1 | 1 | 2 |
| 1 | 2 | 2 | 3 |
| 1 | **3** | 3 | - |
