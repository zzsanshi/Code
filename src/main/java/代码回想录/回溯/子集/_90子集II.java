package 代码回想录.回溯.子集;

import java.util.*;

public class _90子集II {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    Set<Integer> l1 = new HashSet<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        int[] used = new int[nums.length];
        Arrays.sort(nums);
        backtracking(nums,0,used);
        return res;
    }
    void backtracking(int[] nums, int startIndex, int[] used) {
        res.add(new ArrayList<>(path));
        for (int i = startIndex; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i-1] && used[i-1] == 0) {
                continue;
            }
            path.add(nums[i]);
            used[i] = 1;
            backtracking(nums,i+1,used);
            used[i] = 0;
            path.remove(path.size()-1);
        }
    }
}
