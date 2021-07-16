package leecode热门100题;

public class _31下一个排列 {
    public void nextPermutation(int[] nums) {
        //找到第一个相邻升序
        int i = nums.length -2;
        while (i >= 0 && nums[i] > nums[i + 1]) {
            i--;
        }
        if (i >= 0) {
            int j = nums.length - 1;
            while( j >= 0 &&  nums[i] >=  nums[j]) {
                j--;
            }
            swap(nums,i,j);
            reverse(nums, i + 1);
        }
    }
    public void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    public void reverse(int[] nums, int start) {
        int left = start, right = nums.length - 1;
        while (left < right) {
            swap(nums, left, right);
            left++;
            right--;
        }
    }


}
