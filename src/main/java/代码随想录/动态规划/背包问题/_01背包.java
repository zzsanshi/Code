package 代码随想录.动态规划.背包问题;

public class _01背包 {
    public static void main(String[] args) {
        int[] weight = {1, 3, 4};
        int[] value =  {15, 20, 30};
        int bagweight = 4;
        int[][] dp = new int[weight.length][bagweight + 1];

        for (int i = bagweight; i >= weight[0]; i--) {
            dp[0][i] = dp[0][i-weight[0]] + value[0];
        }

        for (int i = 1; i < weight.length; i++) {
            for (int j = 0; j <= bagweight ; j++) {
                if( j < weight[i]) {
                    dp[i][j] = dp[i - 1][j];
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i - 1][j - weight[i]]+value[i]);
                }
            }
        }
        System.out.println(dp[weight.length-1][bagweight]);;
    }
}
