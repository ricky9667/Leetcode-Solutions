class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        var i = 0
        var end = false

        while (i < strs[0].length) {
            for (j in 1 until strs.size) {
                if (i > strs[j].lastIndex) end = true
                else if (strs[0][i] != strs[j][i]) end = true
            }

            if (end) break
            i++
        }

        return strs[0].substring(0, i)
    }
}