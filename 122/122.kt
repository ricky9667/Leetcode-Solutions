class Solution1 {
    fun maxProfit(prices: IntArray): Int {
        var lowestPrice = prices[0]
        var currentMaxProfit = 0

        for (i in 0 until prices.size) {
            if (prices[i] < lowestPrice) {
                lowestPrice = prices[i]
            } else if (prices[i] > lowestPrice) {
                currentMaxProfit += prices[i] - lowestPrice
                lowestPrice = prices[i]
            }
        }

        return currentMaxProfit
    }
}

class Solution2 {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        for (i in 1 until prices.size) {
            maxProfit += max(prices[i] - prices[i-1], 0)
        }
        return maxProfit
    }
}
