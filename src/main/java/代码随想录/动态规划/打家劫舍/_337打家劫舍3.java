package 代码随想录.动态规划.打家劫舍;
/**
* Description:
* date: 2021/4/11 15:33
* @author: zzsanshi
* @since JDK 14
*/

public class _337打家劫舍3 {
    public int rob(TreeNode root) {
        int[] res = dfs(root);
        return Math.max(res[0], res[1]);
    }
    private int[] dfs(TreeNode node) {
        if (node == null) {
            return new int[]{0,0};
        }
        int[] left = dfs(node.left);
        int[] right = dfs(node.right);

        int[] dp = new int[2];

        dp[0] = Math.max(left[0], left[1])+Math.max(right[0],right[1]);
        dp[1] = node.val + left[0] + right[0];
        return dp;
    }

}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}


 