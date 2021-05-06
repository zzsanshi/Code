package _回溯;

import java.util.ArrayList;
import java.util.List;

public class _112 {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int count = targetSum-root.val;
        traversal(root,count);
        return true;
    }

    boolean traversal(TreeNode root, int count) {

        if(root.left == null && root.right == null && count == 0) {
            return true;
        }
        if(root.left == null && root.right == null && count != 0) {
            return  false;
        }

        if (root.left != null) {
            if (traversal(root.left, count - root.left.val))
                return true;
        }
        if (root.right != null) {
            if (traversal(root.right, count - root.right.val))
                return true;
        }
        return false;
    }
}
