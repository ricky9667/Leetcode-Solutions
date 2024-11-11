# [205. Isomorphic Strings](https://leetcode.com/problems/isomorphic-strings/)

Topics: `Hash Table` `String`

## Solution

### Implementation

```kotlin
class Solution {
    fun isIsomorphic(s: String, t: String): Boolean {
        val sMap = mutableMapOf<Char, Char>()
        val tMap = mutableMapOf<Char, Char>()

        for (i in 0 until s.length) {
            if (s[i] in sMap && sMap[s[i]] != t[i]) return false 
            if (t[i] in tMap && tMap[t[i]] != s[i]) return false 
            sMap[s[i]] = t[i]
            tMap[t[i]] = s[i]
        }

        return true
    }
}
```
