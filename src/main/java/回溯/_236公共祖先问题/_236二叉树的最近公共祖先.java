package 回溯._236公共祖先问题;



import java.util.ArrayList;
import java.util.List;

public class _236二叉树的最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null || root == p || root == q) {
            return root;
        }
        TreeNode leftRoot = lowestCommonAncestor(root.left, p, q);
        TreeNode rightRoot = lowestCommonAncestor(root.right, p, q);
        if (leftRoot == null && rightRoot == null) {
            return null;
        }

        if (leftRoot == null) {
            return rightRoot;
        }

        if (rightRoot == null) {
            return leftRoot;
        }
        return root;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

