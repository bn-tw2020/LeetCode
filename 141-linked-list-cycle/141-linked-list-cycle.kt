/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */

class Solution {
    fun hasCycle(head: ListNode?): Boolean {
        if(head == null || head.next == null) return false
        var node = head
        val s = mutableSetOf<ListNode?>()
        
        while(true) {
            if(s.contains(node)) return true
            s.add(node)
            if(node?.next == null) return false
            node = node.next
            
        }
        return true
    }
}