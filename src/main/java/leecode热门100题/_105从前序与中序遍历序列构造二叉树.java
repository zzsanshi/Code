package leecode热门100题;

public class _105从前序与中序遍历序列构造二叉树 {
    public static void main(String[] args) {
        int[] pre = new int[]{1,2};
        int[] in = new int[]{2,1};

        buildTree(pre ,in);
    }
    public static TreeNode buildTree(int[] preorder, int[] inorder) {
        return build(preorder,0,preorder.length-1,inorder,0,inorder.length-1);
    }
    static TreeNode  build(int[] preorder, int l1,int r1,int[] inorder,int l2,int r2) {
        if (l1 > r1) {
            return null;
        }
        if(l1 == r1) {
            return new TreeNode(preorder[l1]);
        }
        int val = preorder[l1];
        int inx = 0;
        for (int i = l2; i <= r2; i++) {
            if(inorder[i] == val) {
               inx = i;
               break;
            }
        }
        int size = inx - l2;
        //左子树
        TreeNode left = build(preorder,l1+1,l1+size,inorder,l2,inx-1);
        //右子树
        TreeNode right = build(preorder,l1+size+1,r1,inorder,inx +1,r2);
        TreeNode root = new TreeNode(preorder[l1],left,right);
        return root;
    }
}
