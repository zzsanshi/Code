package 剑指;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class _32_2从上到下打印二叉树 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return new ArrayList<>();
        }
        Deque<TreeNode> que = new LinkedList<>();
        que.offerLast(root);
        while (!que.isEmpty()) {
            int j = 0;
            List<Integer> temp = new LinkedList<>();
            for (int i = que.size(); i > 0; i--) {
                TreeNode node = que.pollFirst();
                temp.add(node.val);
                if (node.left != null) {
                    que.offerLast(node.left);
                }
                if (node.right != null) {
                    que.offerLast(node.right);
                }
            }
            res.add(temp);
        }
        return res;
    }
}


