package 剑指;

import java.util.ArrayList;
import java.util.List;

public class _34二叉树中和为某一值的路径 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int target) {
        if(root == null) {
            return new ArrayList<>();
        }
        recur(root, target);
        return res;
    }
    void recur(TreeNode root,int target ){

        if(target == root.val && root.left == null && root.right == null ) {
            path.add(root.val);
            res.add(new ArrayList<>(path));
            path.remove(path.size()-1);
            return;
        }

        // target > root.val
        path.add(root.val);
        if(root.left != null) {
            recur(root.left, target- root.val);
        }
        if (root.right != null) {
            recur(root.right, target- root.val);
        }
        path.remove(path.size()-1);
    }
}
