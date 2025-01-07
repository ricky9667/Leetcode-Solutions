# [101. Symmetric Tree](https://leetcode.com/problems/symmetric-tree)

Topics: `Tree` `DFS` `BFS` `Binary Tree`

## Solution

### Implementation

```kotlin
class Solution {
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) return true
        return compare(root.left, root.right)
    }

    fun compare(leftNode: TreeNode?, rightNode: TreeNode?): Boolean {
        if (leftNode == null && rightNode == null) return true
        if (leftNode?.`val` != rightNode?.`val`) return false

        return compare(leftNode!!.left, rightNode!!.right) 
            && compare(leftNode!!.right, rightNode!!.left)
    }
}
```
