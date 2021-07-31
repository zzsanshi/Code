package 代码回想录.动态规划.买卖股票问题;

public class _309买卖股票含冷冻期 {
    public int maxProfit(int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int[][] dp = new int[prices.length][3];
        dp[0][0] = -prices[0];//持有
        for (int i = 1; i < prices.length; i++) {
            dp[i][0] = Math.max(dp[i-1][0], dp[i-1][2] - prices[i]);//持有股票
            dp[i][1] =dp[i - 1][0] + prices[i];//之后处于冷冻期
            dp[i][2] = Math.max(dp[i-1][2],dp[i-1][1]);//之后处于非冷冻期不持有
        }
        return Math.max(dp[prices.length-1][1],dp[prices.length-1][2]);
    }


}
