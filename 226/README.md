# [226. Invert Binary Tree](https://leetcode.com/problems/invert-binary-tree)

Topics: `Tree` `DFS` `BFS` `Binary Tree`

## Solution

### Implementation

```kotlin
class Solution {
    fun invertTree(root: TreeNode?): TreeNode? {
        if (root != null) {
            val newLeft = invertTree(root.right)
            val newRight = invertTree(root.left)
            root.apply {
                left = newLeft
                right = newRight
            }
        }
        return root
    }
}
```
