# [230. Kth Smallest Element in a BST](https://leetcode.com/problems/kth-smallest-element-in-a-bst)

Topics: `Tree` `Depth-First Search` `Binary Search Tree` `Binary Tree`

## Solution

### Implementation

```kotlin
class Solution {
    var count = 0
    var result: Int? = null

    fun kthSmallest(root: TreeNode?, k: Int): Int {
        traverse(root, k)
        return result!!
    }

    fun traverse(root: TreeNode?, k: Int) {
        if (root == null) return
        if (result != null) return

        traverse(root.left, k)
        if (++count == k) {
            result = root.`val`
            return
        }
        traverse(root.right, k)
    }
}
```
