package leecode热门100题;



/**
* Description:
 * 在上次打劫完一条街道之后和一圈房屋后，小偷又发现了一个新的可行窃的地区。
 * 这个地区只有一个入口，我们称之为“根”。 除了“根”之外，每栋房子有且只有一个“父“房子与之相连。
 * 一番侦察之后，聪明的小偷意识到“这个地方的所有房屋的排列类似于一棵二叉树”。
 * 如果两个直接相连的房子在同一天晚上被打劫，房屋将自动报警。
 *
 * 计算在不触动警报的情况下，小偷一晚能够盗取的最高金额。
* date: 2021/7/31 11:51
* @author: zzsanshi 
* @since JDK 14
*/

public class _337打家劫舍Ⅲ {
    //树形动态规划
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
