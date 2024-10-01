class Solution {
    fun lengthOfLastWord(s: String): Int {
        var index = s.lastIndex
        var endIndex = -1

        while (index >= 0) {
            if (endIndex == -1) {
                if (s[index] != ' ') endIndex = index 
            } else {
                if (s[index] == ' ') break
            }
            index--
        }

        return endIndex - index
    }
}