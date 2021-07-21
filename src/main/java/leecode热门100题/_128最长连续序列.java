package leecode热门100题;

import java.util.Arrays;

public class _128最长连续序列 {
    public int longestConsecutive(int[] nums) {
        if(nums.length <= 1) {
            return nums.length;
        }
        Arrays.sort(nums);
        int n = nums.length;
        int[] dp = new int[n];
        dp[0] = 1;
        int m = Integer.MIN_VALUE;
        for (int i = 1; i < n; i++) {
            if(nums[i] == nums[i-1] + 1 ) {
                dp[i] = dp[i-1] + 1;
            } else if( nums[i] == nums[i-1]) {
                dp[i] = dp[i-1];
            }
            else {
                dp[i] =1;
            }
            m = Math.max(m,dp[i]);
        }
        return m;
    }
}
