class Solution {
    fun maxProfit(prices: IntArray): Int {
        var lowestPrice = prices[0]
        var currentMaxProfit = 0

        prices.forEach { price ->
            if (price < lowestPrice) {
                lowestPrice = price
            }
            if (price - lowestPrice > currentMaxProfit) {
                currentMaxProfit = price - lowestPrice
            }
        }

        return currentMaxProfit
    }
}
