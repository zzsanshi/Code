package leecode热门100题;

public class _543二叉树的直径 {
    int res = 0;
    public int diameterOfBinaryTree(TreeNode root) {
            dfs(root);
            return res;
    }
    int dfs(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int left = dfs(root.left);
        int right = dfs(root.right);
        res = Math.max(left + right, res);
        return Math.max(left, right) + 1;
    }
}
