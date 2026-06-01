class Solution {
    public int maxProfit(int[] prices) {
        int bp= Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0; i<prices.length; i++)
        {
            if(prices[i]>bp)
            {
                int profit = prices[i]-bp;
                maxprofit = Math.max(maxprofit,profit);
            }
            else{
            bp= prices[i];
            }
        }
        return maxprofit;
    }
}