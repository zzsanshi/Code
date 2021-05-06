package 动态规划.买卖股票问题;

public class _188买卖股票4 {
    public int maxProfit(int k, int[] prices) {
        if (prices.length == 0) {
            return 0;
        }
        int[][] dp = new int[prices.length][2*k+1];
        for (int i = 1; i < 2*k; i+=2) {
            dp[0][i] = - prices[0];
        }

        for (int i = 1; i < prices.length; i++) {
            for (int j = 0; j < 2 * k - 1; j += 2) {
                dp[i][j + 1] = Math.max(dp[i - 1][j + 1], dp[i - 1][j] - prices[i]);//买入操作
                dp[i][j + 2] = Math.max(dp[i - 1][j + 2], dp[i - 1][j + 1] + prices[i]);//卖出操作
            }
        }
        return dp[prices.length-1][2*k];

    }

}
