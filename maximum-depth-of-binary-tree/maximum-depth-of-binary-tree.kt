/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class Solution {
    var depth = 0
    var maxDepth = 0
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) return maxDepth
        
        depth++
        maxDepth = maxDepth.coerceAtLeast(depth)
        maxDepth(root.left)
        maxDepth(root.right)
        depth--
        return maxDepth
    }
}