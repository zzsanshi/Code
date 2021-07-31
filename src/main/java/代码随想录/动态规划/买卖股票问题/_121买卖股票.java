package 代码随想录.动态规划.买卖股票问题;

public class _121买卖股票 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        if ( n < 2) {
            return 0;
        }
        int[][] dp = new int[n][2];
        dp[0][0] = 0;
        dp[0][1] = - prices[0];

        for (int i = 1; i < n ; i++) {
            dp[i][0] = Math.max(dp[i-1][0],dp[i-1][1] +prices[i] );
            dp[i][1] = Math.max(- prices[i],dp[i-1][1]);
        }
        return dp[n-1][0];
    }
}
