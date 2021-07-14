package leecode热门100题;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _15三数之和 {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        for (int k = 0; k < n; k++) {
            if(nums[k] > 0) break;
            if(k > 0 && nums[k] == nums[k - 1]) continue;
            int i = k+1,j = n-1;
            while(i < j){
                if(nums[k] + nums[i] + nums[j] > 0) {
                    j--;
                } else if (nums[k] + nums[i] + nums[j] < 0) {
                    i++;
                }else {
                    res.add(new ArrayList<>(Arrays.asList(nums[k],nums[i],nums[j])));
                    while(i < j && nums[i] == nums[++i]);
                    while(i < j && nums[j] == nums[--j]);
                }
            }
        }
        return res;
    }
}
