class Solution {
    
    val convert = mapOf('2' to "abc", '3' to "def", '4' to "ghi", '5' to "jkl",
            '6' to "mno", '7' to "pqrs", '8' to "tuv", '9' to "wxyz")
    
    fun letterCombinations(digits: String): List<String> {
        var ret = mutableListOf<String>()
        if(digits.length == 0) return ret
        dfs(0, "", digits, ret)
        return ret
    }
    
    fun dfs(idx: Int, word: String, digits: String, ret: MutableList<String>) {
        if(idx == digits.length) {
            ret.add(word)
            return
        }
                
        for(ch in convert[digits[idx]]!!) {
            dfs(idx + 1, word + ch, digits, ret)
        }
    }
    
}