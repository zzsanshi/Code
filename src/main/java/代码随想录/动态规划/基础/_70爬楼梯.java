package 代码随想录.动态规划.基础;

public class _70爬楼梯 {
    public int climbStairs(int n) {
        if (n <= 1) {
            return n;
        }
        int dp[] = new int[n+1];
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i < n+1 ; i++) {
            dp[i] = dp[i - 1] + dp[i - 2];
        }
        return dp[n];
    }
}
