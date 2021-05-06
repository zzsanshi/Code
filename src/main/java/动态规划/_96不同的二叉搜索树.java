package 动态规划;

public class _96不同的二叉搜索树 {
    public int numTrees(int n) {
        if( n <= 2 ) {
            return n;
        }
        int[] dp = new int[n+1];
        dp[0] = 1;
        dp[1] = 1;
        dp[2] = 2;
        for (int i = 3; i <= n; i++) {
            int sum = 0;
            for (int j = 1; j <= i ; j++) {
                int left = j - 1;
                int right = i - j;
                sum += dp[left] * dp[right];
            }
            dp[i] = sum;
        }
        return dp[n];

    }
}
