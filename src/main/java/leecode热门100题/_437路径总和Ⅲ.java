package leecode热门100题;

import java.util.LinkedList;

/**
 * Description:
 * 给定一个二叉树的根节点 root ，和一个整数 targetSum ，求该二叉树里节点值之和等于 targetSum 的 路径 的数目。
 * <p>
 * 路径 不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 * <p>
 * date: 2021/8/1 12:58
 *
 * @author: zzsanshi
 * @since JDK 14
 */
public class _437路径总和Ⅲ {

    public int pathSum(TreeNode root, int targetSum) {
        if (root == null) {
            return 0;
        }
        int res = 0;
        LinkedList<TreeNode> que = new LinkedList<>();
        que.addLast(root);
        TreeNode tmp = null;
        while (!que.isEmpty()) {
            tmp = que.removeFirst();
            res += dfs(tmp, targetSum);
            if (tmp.left != null) {
                que.addLast(tmp.left);
            }
            if (tmp.right != null) {
                que.addLast(tmp.right);
            }
        }
        return res;
    }

    int dfs(TreeNode root, int sum) {
        int res = 0;
        if (root == null) {
            return 0;
        }
        if (sum - root.val == 0) {
            res+= 1;
        }
        return res +dfs(root.left, sum - root.val)+ dfs(root.right, sum - root.val);//包含根节点

    }
}
