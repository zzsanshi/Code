package leecode热门100题;

import java.util.ArrayList;
import java.util.List;

public class _78子集 {
    public List<List<Integer>> subsets(int[] nums) {
        if (nums.length == 0) {
            return new ArrayList<>();
        }
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        backtrace(res, nums, 0, path);
        return res;
    }

    void backtrace(List<List<Integer>> res, int[] nums, int start, List<Integer> path) {
        res.add(new ArrayList<>(path));
        if (start >= nums.length) {
            return;
        }
        for (int i = start; i < nums.length; i++) {
            path.add(nums[i]);
            backtrace(res, nums, i + 1, path);
            path.remove(path.size() - 1);
        }
    }
}
