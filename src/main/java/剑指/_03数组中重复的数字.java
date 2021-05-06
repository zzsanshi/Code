package 剑指;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class _03数组中重复的数字 {
    public int findRepeatNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 1; i <nums.length ; i++) {
            if(nums[i] == nums[i - 1]) {
                return nums[i];
            }

        }
        return -1;
    }
    public int find2(int[] nums) {
        Set<Integer> map = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            if(!map.add(nums[i])) {
                return nums[i];
            }
        }
        return -1;
    }
}
