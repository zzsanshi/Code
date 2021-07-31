package 代码随想录.动态规划.背包问题;

import java.util.stream.IntStream;

public class _416分割等和子集 {
    public boolean canPartition(int[] nums) {
        int sum =  IntStream.of(nums).sum();
        if( sum % 2 != 0) {
                return false;
        }

        int bagweight = sum/2;
        int[] dp = new int[bagweight+1];
        for (int i = 0; i < nums.length ; i++) {
            for (int j = bagweight; j >= nums[i] ; j--) {
                dp[j] = Math.max(dp[j], dp[j-nums[i]]+nums[i]);
            }
        }
        if (dp[bagweight] == bagweight) {
            return true;
        }
        return false;
    }
}
