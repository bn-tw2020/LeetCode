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
    fun invertTree(root: TreeNode?): TreeNode? {
        if(root != null) {
            var leftTree = invertTree(root.left)
            var rightTree = invertTree(root.right)
            root.left = rightTree
            root.right = leftTree
        }
        return root
    }
}