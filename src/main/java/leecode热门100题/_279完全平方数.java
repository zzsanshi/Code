package leecode热门100题;

import java.util.Scanner;

public class _279完全平方数 {
    public int numSquares(int n) {
        int[] dp = new int[n+1];
        dp[1] = 1;
        for (int i = 2; i <= n; i++) {
            int res = Integer.MAX_VALUE;
            for (int j = 1; j*j <= i; j++) {
                 res = Math.min(1 + dp[i-j*j],res);
            }
            dp[i] = res;
        }
        return dp[n];
    }

}
