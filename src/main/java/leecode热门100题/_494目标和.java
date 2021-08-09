package leecode热门100题;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class _494目标和 {
    int res = 0;
    public int findTargetSumWays(int[] nums, int target) {
        if (nums.length == 0) {
            return 0;
        }
        a(nums,target,0,0);
        return res;
    }
    void a(int[] nums,int target,int sum,int inx) {
        if(sum == target && inx == nums.length) {
            res++;
            return;
        }
        if(inx < nums.length){
            a(nums,target,sum+nums[inx],inx+1);
            a(nums,target,sum-nums[inx],inx+1);}
    }
}
