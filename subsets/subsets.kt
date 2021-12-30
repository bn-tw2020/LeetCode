class Solution {
    
    var list = mutableListOf<Int>()
    fun go(cnt: Int, nums: IntArray, here: Int, ret: MutableList<MutableList<Int>>) {
        if(cnt == list.size) {
            var temp = mutableListOf<Int>()
            list.forEach { temp.add(it) }
            ret.add(temp)
            return;
        }
        
        for (i in here+1 until nums.size) {
            list.add(nums[i])
            go(cnt, nums, i, ret)
            list.removeAt(list.size - 1)
        }
    }
    
    fun subsets(nums: IntArray): List<List<Int>> {
        var ret = mutableListOf<MutableList<Int>>()
        for(i in 0..nums.size)
            go(i, nums, -1, ret)
        return ret
    }
}