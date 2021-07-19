package leecode热门100题;

import java.util.*;

public class _102二叉树的层序遍历 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) {
            return new ArrayList<>();
        }
        Queue<TreeNode> que = new LinkedList<>();
        List<List<Integer>> res = new ArrayList<>();
        que.offer(root);
        while (!que.isEmpty()) {
            List<Integer> ans = new ArrayList<>();
            for (int i = 0; i < que.size(); i++) {
                TreeNode temp = que.poll();
                ans.add(temp.val);
                if (temp.left != null) {
                    que.offer(temp.left);
                }
                if (temp.right != null) {
                    que.offer(temp.right);
                }
            }
            res.add(new ArrayList<>(ans));
        }
        return res;
    }
}
