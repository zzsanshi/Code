package leecode热门100题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _34在排序数组中查找元素的第一个和最后一个位置 {
    public int[] searchRange(int[] nums, int target) {
        if (nums.length == 0) {
            return new int[]{-1, -1};
        }
        if (nums.length == 1 && nums[0] == target) {
            return new int[]{0};
        }
        int n = nums.length;
        int left = 0, right = nums.length - 1;
        int middle = 0;
        boolean flag = false;
        while (left <= right) {
            middle = (left + right) / 2;
            if (nums[middle] == target) {
                flag = true;
                break;
            }
            if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }
        if (flag == false) {
            return new int[]{-1, -1};
        }
        List<Integer> res = new ArrayList<>();
        res.add(middle);
        //向左遍历
        left = middle - 1;
        while (left >= 0) {
            if (nums[left] == target) {
                res.add(left--);
            } else {
                break;
            }
        }
        //
        right = middle + 1;
        while (right <= nums.length - 1) {
            if (nums[right] == target) {
                res.add(right++);
            } else {
                break;
            }
        }
        int[] ans = new int[res.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = res.get(i);
        }
        Arrays.sort(ans);

        return new int[]{ans[0],ans[ans.length-1] };
    }

}
