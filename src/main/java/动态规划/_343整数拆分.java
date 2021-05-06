package 动态规划;

public class _343整数拆分 {
    public int integerBreak(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 3; i <= n; i++) {
            int max = Integer.MIN_VALUE;
            for (int j = 1; j <= i/2 ; j++) {
                int left = Math.max(dp[j], j);
                int right = Math.max(dp[i-j],i-j);
                if(max < left* right) {
                    max = left*right;
                }
            }
            dp[i] = max;
        }
        return dp[n];
    }
}
