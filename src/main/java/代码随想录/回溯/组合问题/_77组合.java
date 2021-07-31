package 代码随想录.回溯.组合问题;

import java.util.ArrayList;
import java.util.List;

/**
* Description:
 * 给定两个整数 n 和 k，返回范围 [1, n] 中所有可能的 k 个数的组合。
 * 你可以按 任何顺序 返回答案
* date: 2021/7/31 10:41
* @author: zzsanshi 
* @since JDK 14
*/
public class _77组合 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        backtacking(n,k,1);
        return res;
    }
    void backtacking (int n, int k, int startIndex) {
        if (path.size() == k) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i = startIndex; i <= n; i++) {
            path.add(i);
            backtacking(n,k,i+1);
            path.remove((Object)i);
        }
    }
}
