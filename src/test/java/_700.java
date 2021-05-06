public class _700 {
    public TreeNode searchBST(TreeNode root, int val) {
            if(root == null) {
                return root;
            }
            return search(root,val);
    }
    TreeNode search(TreeNode root , int val) {
        if (root.val == val) {
            return root;
        }
        if (root.left == null && root.right == null) {
            return null;
        }
        if (val < root.val && root.left != null) {
            return search(root.left,val);
        } else if (val < root.val && root.left == null) {
            return null;
        }else if(val > root.val && root.right != null ) {
            return search(root.right,val);
        } else {
            return null;
        }
    }
}
