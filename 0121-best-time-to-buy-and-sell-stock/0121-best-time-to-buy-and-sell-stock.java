class Solution {
    public int maxProfit(int[] prices) {
      int maxProfit = 0, max = -1, k =prices.length - 1,currProfit;
      while(k >=0) {
        currProfit = max - prices[k];
        maxProfit = Math.max(maxProfit,currProfit);
        max = Math.max(max,prices[k]);
        k--;
      }
      return maxProfit;        
    }
}