import java.util.*

class Solution {
    
    var ret = mutableListOf<MutableList<Int>>()
    var temp = mutableListOf<Int>()
    var visit = IntArray(6)

    fun run(nums: IntArray, cnt: Int) {
        if(nums.size == cnt) {
            var list = mutableListOf<Int>()
            temp.forEach { list.add(it) }
            ret.add(list)
            return
        }
        
        for(i in 0 until nums.size) {
            if(visit[i] != 0) continue
            visit[i] = 1
            temp.add(nums[i])
            run(nums, cnt + 1)
            visit[i] = 0
            temp.removeAt(temp.size - 1)
        }
    }
    
    fun permute(nums: IntArray): List<List<Int>> {
        run(nums, 0)
        return ret
    }
}