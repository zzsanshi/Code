package leecode热门100题;
//二分查找
public class _33搜索旋转排序数组 {
    public int search(int[] nums, int target) {
        int left = 0,right = nums.length - 1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[left] <= nums[mid]) {
                if (target >= nums[left] && target < nums[mid]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }

            } else {
                if(target>=nums[mid] && target< nums[right]) {
                    left = mid + 1;
                }else {
                    right = mid -1;
                }
            }
        }
        return -1;
    }
}
