package 剑指Offer;

public class _63股票的最大利润 {
    public int maxProfit(int[] prices) {
        if(prices.length == 0) {
            return 0;
        }
        int n = prices.length;
        int[][] dp = new int[n][2];
        dp[0][0] = -prices[0];
        dp[0][1] = 0;
        int res = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            dp[i][0] = Math.max(dp[i-1][0] , -prices[i]);
            dp[i][1] =  dp[i-1][0] + prices[i];
            res = Math.max(res,dp[i][1]);
        }
        if(res <=0) {
            return 0;
        }
        return res;


    }
}
