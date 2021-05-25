package 剑指;

public class _21调整数组顺序使奇数位于偶数前面 {
    public int[] exchange(int[] nums) {
        int l = 0;
        int r = nums.length - 1;
        while (l < r) {
            if ((nums[l] & 1) == 1 && (nums[r] & 1) == 0) {
                l++;
                r--;
            } else if ((nums[l] & 1) == 0 && (nums[r] & 1) == 1) swap(l++, r--, nums);
            else if ((nums[l] & 1) == 1) l++;
            else r--;
        }
        return nums;
    }
    public void swap(int a, int b, int[] nums) {
        int temp = nums[a];
        nums[a] = nums[b];
        nums[b] = temp;
    }
}
