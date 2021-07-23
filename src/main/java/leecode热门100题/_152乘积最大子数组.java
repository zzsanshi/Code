package leecode热门100题;

public class _152乘积最大子数组 {
    public int maxProduct(int[] nums) {
        if (nums.length == 1) {
            return nums[0];
        }
        int imax = nums[0], imin = nums[0];
        int res =imax;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                int temp = imax;
                imax = imin;
                imin = temp;
            }
            imax = Math.max(imax * nums[i], nums[i]);
            imin = Math.min(imin * nums[i], nums[i]);
            res = Math.max(res, imax);
        }
        return res;

    }
}
