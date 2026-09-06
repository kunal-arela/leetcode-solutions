// 121. Best Time to Buy and Sell Stock (Easy)
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/

class Solution {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int min = prices[0];
        int max = 0;
        for(int i = 0;i<n;i++){
            if(prices[i] < min){
                min = prices[i];
            }
            int profit = prices[i] - min;
             max = Math.max(max , profit);
        }
        return max;                                                         
    }
}