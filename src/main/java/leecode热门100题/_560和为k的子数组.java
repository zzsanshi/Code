package leecode热门100题;

//前缀和求解
public class _560和为k的子数组 {
    int res;
    public int subarraySum(int[] nums, int k) {
        if (nums.length == 0) {
            return 0;
        }
        //前缀和
        int[] preSum = new int[nums.length + 1];
        preSum[0] = 0;
        for (int i = 0; i < nums.length; i++) {
            preSum[i + 1] = preSum[i] + nums[i];
        }
        for (int left = 0; left < nums.length; left++) {
            for (int right = left; right < nums.length; right++) {
                if (preSum[right + 1] - preSum[left] == k) {
                    res++;
                }
            }

        }
        return res;
    }
}
