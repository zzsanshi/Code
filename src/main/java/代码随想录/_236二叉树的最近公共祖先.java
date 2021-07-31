package 代码随想录;


//后序遍历
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
        //如果都不为空则该节点为最近公共祖先
        return root;
    }
}



