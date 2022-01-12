class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var i = 0
        var j = 0
        
        var prefix = strs[0]
        for (s in strs) {
            
            var i = 0
            var j = 0
            while(i < prefix.length && j < s.length) {
                if(prefix[i] != s[j]) break
                i++
                j++
            }
            prefix = prefix.substring(0, i)
        }
        return prefix
    }
}