# [124. Binary Tree Maximum Path Sum](https://leetcode.com/problems/binary-tree-maximum-path-sum)

Topics: `Dynamic Programming` `Tree` `Depth-First Search` `Binary Tree`

## Solution

參考 [Neetcode - Binary Tree Maximum Path Sum](https://youtu.be/Hr5cWUld4vU?si=rQiEy-jtLKoGyCyQ)

### Implementation

```kotlin
class Solution {
    val map = mutableMapOf<TreeNode, Int>()

    fun maxPathSum(root: TreeNode?): Int {
        if (root == null) return 0

        var maxSum = root.`val`
        maxSum += max(pathSum(root.left), 0)
        maxSum += max(pathSum(root.right), 0)

        root.left?.let { maxSum = max(maxPathSum(it), maxSum) }
        root.right?.let { maxSum = max(maxPathSum(it), maxSum) }
        return maxSum
    }

    fun pathSum(root: TreeNode?): Int {
        if (root == null) return 0

        if (!map.containsKey(root)) {
            val left = pathSum(root.left)
            val right = pathSum(root.right)
            map[root] = root.`val` + maxOf(left, right, 0)
        }

        return map[root]!!
    }    
}
```