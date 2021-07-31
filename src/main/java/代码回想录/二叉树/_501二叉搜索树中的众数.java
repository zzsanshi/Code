package 代码回想录.二叉树;



import java.util.ArrayList;
import java.util.List;

public class _501二叉搜索树中的众数 {
    TreeNode pre;
    int count;
    int maxCount;
    List<Integer> res = new ArrayList<>();
    public int[] findMode(TreeNode root) {
        pre = null;
        count = 0;
        maxCount = 0;
        search(root);
        int[] mode = new int[res.size()];
        for (int i = 0; i < res.size(); ++i) {
            mode[i] = res.get(i);
        }
        return mode;
    }
    void search(TreeNode root) {
        if(root == null) {
            return;
        }
        search(root.left);
        if (pre == null) {
            count = 1;
        }else if (pre.val == root.val) {
            count++;
        } else {
            count = 1;
        }
        pre = root;
        if (count == maxCount) {
            res.add(root.val);
        }
        if (count > maxCount) {
            maxCount = count;
            res.clear();
            res.add(root.val);
        }
        search(root.right);
    }
}
