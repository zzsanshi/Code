package 剑指;

public class _14_1剪绳子 {
    public int cuttingRope(int n) {
        if( n <= 1) {
            return n;
        }

        int[] dp = new int[n +1];
        dp[1] = 1;
        dp[2] = 1;
        for (int i = 2; i <= n; i++) {
            for (int j = 1; j <= i/2; j++) {

                dp[i] = Math.max(dp[i],j*(i-j));
                dp[i] = Math.max(dp[i],j*dp[i-j]);


            }
        }
        return dp[n];

    }
}
