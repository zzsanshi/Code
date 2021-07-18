package leecode热门100题;
//双指针
public class _75颜色分类 {
    public void sortColors(int[] nums) {
        if (nums.length == 1) {
            return;
        }
        int temp = 0;
        int p0 = 0, p2 = nums.length - 1;
        for (int i = 0; i < nums.length; i++) {
            while (i <= p2 && nums[i] == 2) {
                temp = nums[i];
                nums[i] = nums[p2];
                nums[p2] = temp;
                --p2;
            }
            if (nums[i] == 0) {
                temp = nums[i];
                nums[i] = nums[p0];
                nums[p0] = temp;
                ++p0;
            }
        }
    }
}
