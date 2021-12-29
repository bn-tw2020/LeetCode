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
    
    var ret = mutableListOf<Int>()
    fun inorderTraversal(root: TreeNode?): List<Int> {
        if(root == null) return ret
        
        inorderTraversal(root.left)
        ret.add(root.`val`)
        inorderTraversal(root.right)
        return ret
    }
}