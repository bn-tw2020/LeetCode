class Solution {
    fun partitionLabels(s: String): List<Int> {
        var size = s.length
        var answer = mutableListOf<Int>()
        var alpha = IntArray(26)
        
        for(i in 0 until size) alpha[s[i] - 'a'] = i
        
        var farIndex = -1
        var startIndex = 0
        
        for(i in 0 until size) {
            if(alpha[s[i] - 'a'] > farIndex) {
                farIndex = alpha[s[i] - 'a']
            }
            
            if(i == farIndex) {
                answer.add(i - startIndex + 1)
                startIndex = i + 1
            }
        }
        return answer
    }
}