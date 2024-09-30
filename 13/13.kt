class Solution {
    val romanMap = mapOf(
        "I" to 1,
        "V" to 5,
        "X" to 10,
        "L" to 50,
        "C" to 100,
        "D" to 500,
        "M" to 1000,
        "IV" to 4,
        "IX" to 9,
        "XL" to 40,
        "XC" to 90,
        "CD" to 400,
        "CM" to 900
    )

    fun getRomanInt(s: String): Int = romanMap[s] ?: 0

    fun romanToInt(s: String): Int {
        var result = 0
        var i = 0

        while (i < s.lastIndex) {
            val current = s[i].toString()
            val next = s[i+1].toString()

            if (getRomanInt(current) < getRomanInt(next)) {
                val key = "$current$next"
                result += getRomanInt(key)
                i += 2
            } else {
                result += getRomanInt(current)
                i++
            }
        }

        if (i < s.length) result += getRomanInt(s[i].toString())

        return result 
    }
}