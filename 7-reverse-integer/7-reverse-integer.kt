class Solution {
    fun reverse(x: Int): Int {
        val flag = if(x < 0) true else false
        var ans = ""
        if(flag) {
            ans = "-" + x.toString().substring(1).reversed()
        }
        else ans = x.toString().reversed()
        return if(ans.toLong() > Int.MAX_VALUE || ans.toLong() < Int.MIN_VALUE) 0 else ans.toInt()
    }
}