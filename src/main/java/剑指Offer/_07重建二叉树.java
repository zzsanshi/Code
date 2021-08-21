package 剑指Offer;

public class _07重建二叉树 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = build(preorder,inorder,0,preorder.length-1,0,preorder.length-1);
        return root;

    }
    TreeNode build(int[] preorder, int[] inorder, int preorder_left, int preorder_right, int inorder_left, int inorder_right) {
        if (preorder_left > preorder_right) {
            return null;
        }
        TreeNode root = new TreeNode(preorder[preorder_left]);
        int index = 0;
        for (int i = 0; i < inorder.length; i++) {
            if (inorder[i] == preorder[preorder_left]) {
                index = i;
                break;
            }
        }
        int size_left = index - inorder_left;
        root.left = build(preorder,inorder,preorder_left+1,preorder_left+size_left,inorder_left, index - 1);
        root.right = build(preorder,inorder,preorder_left+1+size_left,preorder_right,index+1,inorder_right);
        return root;

    }

}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
