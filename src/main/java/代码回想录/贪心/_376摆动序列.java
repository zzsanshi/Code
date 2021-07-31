package 代码回想录.贪心;

public class _376摆动序列 {
    public int wiggleMaxLength(int[] nums) {
        int n = nums.length;
        if (n <= 1) {
            return nums.length;
        }
        int count = 1;
        int pre = 0;
        int cur = 0;
        for (int i = 1; i < n; i++) {
            cur = nums[i] - nums[i - 1];
            if ((cur > 0 && pre <= 0) || (pre >= 0 && cur < 0)) {
                count++;
                pre = cur;
            }
        }
        return count;
    }
}
