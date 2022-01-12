class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        
        var list = mutableListOf<Pair<Int, Int>>()
        nums.forEachIndexed { idx, item -> list.add(Pair(item, idx)) }
        list.sortWith(compareBy<Pair<Int,Int>> { it.first })

        var left = 0
        var right = nums.size - 1
        while(left <= right) {
            if(list[left].first + list[right].first == target) return intArrayOf(list[left].second, list[right].second)
            else if(list[left].first + list[right].first < target) left++
            else right--
        }
        return intArrayOf()
    }
}