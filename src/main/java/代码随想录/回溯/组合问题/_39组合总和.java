package 代码随想录.回溯.组合问题;
/**
* Description:
 * 给定一个无重复元素的正整数数组 candidates 和一个正整数 target ，找出 candidates 中所有可以使数字和为目标数 target 的唯一组合。
 * candidates 中的数字可以无限制重复被选取。如果至少一个所选数字数量不同，则两种组合是唯一的。 
 * 对于给定的输入，保证和为 target 的唯一组合数少于 150 个。
* date: 2021/7/31 11:10
* @author: zzsanshi
* @since JDK 14
*/
import java.util.ArrayList;
import java.util.List;

public class _39组合总和 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        backtracking(candidates, target, 0, 0);
        return res;

    }

    void backtracking(int[] candidates, int target, int sum, int index) {
        if (sum > target) {
            return;
        }
        if (sum == target) {
            res.add(new ArrayList<>(path));
            return;
        }
        //切割过的不能再切割
        for (int i = index; i < candidates.length; i++) {
            sum += candidates[i];
            path.add(candidates[i]);
            backtracking(candidates, target, sum, i);////可重复读选择
            sum -= candidates[i];
            path.remove(path.size() - 1);
        }
    }
}
