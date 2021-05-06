package 回溯;

import java.util.ArrayList;
import java.util.List;

public class _39组合总和 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtracking(candidates,target,0,0);
        return res;

    }
    void backtracking(int[] candidates, int target,int sum,int index) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }
        for (int i = index; i < candidates.length; i++) {
            sum+=candidates[i];
            path.add(candidates[i]);
            backtracking(candidates,target,sum,i);
            sum-=candidates[i];
            path.remove(path.size()-1);
        }
    }
}
