package leecode热门100题;

public class _236二叉树最近公共祖先 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
            if(root == null || root == p || root == q) {
                return root;
            }
            TreeNode left = lowestCommonAncestor(root.left,p,q);
            TreeNode right = lowestCommonAncestor(root.right,p,q);
            if(left == null && right == null) {
                return null;
            }
            if(left != null){
                return left;
            }
            if(right != null) {
                return right;
            }
            return  root;
    }
}
