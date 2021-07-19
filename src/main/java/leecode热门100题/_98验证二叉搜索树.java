package leecode热门100题;
//二叉搜索树中序遍历后是递增的
public class _98验证二叉搜索树 {

    public boolean isValidBST(TreeNode root) {
        return charge(root,Integer.MIN_VALUE,Integer.MAX_VALUE);
    }
    Boolean charge(TreeNode root,int min,int max) {
        if(root == null) {
            return true;
        }
        if(root.val <= min || root.val >= max) {
            return false;
        }
        return charge(root.left,min,root.val) && charge(root.right,root.val,max);
    }
}
