package 代码回想录.动态规划.子序列;

import java.util.Arrays;

public class _674最长连续递增子序列 {
    public int findLengthOfLCIS(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int res = 0;
        for (int i = 1; i < nums.length; i++) {
                if (nums[i-1] < nums[i]) {
                    dp[i] = dp[i-1] +1;
                }
                res = Math.max(res,dp[i]);
            }
        return res;

    }
}
