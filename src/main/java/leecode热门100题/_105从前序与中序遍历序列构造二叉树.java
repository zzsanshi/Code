package leecode热门100题;

public class _105从前序与中序遍历序列构造二叉树 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {

        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    TreeNode build(int[] preorder, int l1,int r1,int[] inorder,int l2,int r2) {
        if(l1 == r1) {
            return new TreeNode(preorder[l1]);
        }
        int val = preorder[l1];
        int size = 0;
        for (int i = l2; i <= r2; i++) {
            if(inorder[i] != val) {
                size++;
            }else {
                break;
            }
        }
        TreeNode left = build(preorder,l1+1,l1+size,inorder,l1+2,r2);
        TreeNode root = new TreeNode(preorder[l1]);

    }
}
