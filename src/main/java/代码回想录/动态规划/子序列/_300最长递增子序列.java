package 代码回想录.动态规划.子序列;

import java.util.Arrays;

public class _300最长递增子序列 {
    public int lengthOfLIS(int[] nums) {
        if (nums.length <= 1) {
            return nums.length;
        }
        int[] dp = new int[nums.length];
        Arrays.fill(dp,1);
        int res = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < i ; j++) {
                if (nums[j] < nums[i]) {
                    dp[i] = Math.max(dp[i], dp[j] +1);
                }
                res = Math.max(res,dp[i]);
            }
        }
        return res;
    }
}
