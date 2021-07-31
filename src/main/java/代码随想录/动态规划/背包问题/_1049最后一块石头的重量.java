package 代码随想录.动态规划.背包问题;

import java.util.stream.IntStream;

public class _1049最后一块石头的重量 {
    public int lastStoneWeightII(int[] stones) {
        int sum = IntStream.of(stones).sum();
        int targert = sum/2;
        int[] dp = new int[targert+1];
        for (int i = 0; i < stones.length ; i++) {
            for (int j = targert; j >= stones[i] ; j--) {
                dp[j] = Math.max(dp[j], dp[j - stones[i]] + stones[i]);
            }
        }
        return sum - dp[targert] - dp[targert];
    }
}
