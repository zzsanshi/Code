package 剑指Offer;

public class _57和为s的两个数字 {
    public int[] twoSum(int[] nums, int target) {
        int start = 0, end = nums.length - 1;
        while(start != end) {
            if(nums[start] + nums[end] == target) {
                return new int[]{nums[start],nums[end]};
            }
            if(nums[start] + nums[end] > target) {
                end --;
            }
            if(nums[start] + nums[end] < target) {
                start ++;
            }
        }
        return new int[0];
    }
}
