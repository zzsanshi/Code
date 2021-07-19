package leecode热门100题;

public class _101对称二叉树 {
    public boolean isSymmetric(TreeNode root){
        if(root == null) {
            return true;
        }
        return charge(root.left,root.right);
    }
    boolean charge(TreeNode left,TreeNode right) {
        if(left == null && right == null) {
            return true;
        }
        if(left == null || right == null) {
            return false;
        }

        if(left.val == right.val){
           return charge(left.left,right.right) && charge(left.right,right.left);
        }
        return false;
    }
}
