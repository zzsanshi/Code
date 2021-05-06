package 动态规划.打家劫舍;

public class _213打家劫舍 {
    public int rob(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        if (nums.length == 1) {
            return nums[0];
        }
        int result1 = robRange(nums, 1,nums.length - 1);
        int result2 = robRange(nums, 0,nums.length - 2);
        return Math.max(result1,result2);

    }
    int robRange (int[] nums, int start, int end) {
        if (end == start) {
            return nums[end];
        }
        int[] dp = new int[nums.length];
        dp[start] = nums[start];
        dp[start + 1] = Math.max(nums[start], nums[start +1]);
        for (int i = start + 2; i <= end ; i++) {
            dp[i] = Math.max(dp[i - 1], dp[i -2] + nums[i]);
        }
        return dp[end];
    }
}
