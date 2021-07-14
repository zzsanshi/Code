package 剑指;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class _32_3从上到下打印二叉树 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        Deque<TreeNode> que = new LinkedList<>();
        que.offerLast(root);
        while (!que.isEmpty()) {
            LinkedList<Integer> temp = new LinkedList<>();
            for(int i = que.size(); i > 0; i--) {
                TreeNode node = que.poll();
                if(res.size() % 2 == 0) temp.addLast(node.val); // 偶数层 -> 队列头部
                else temp.addFirst(node.val); // 奇数层 -> 队列尾部
                if(node.left != null) que.add(node.left);
                if(node.right != null) que.add(node.right);
            }
            res.add(temp);
        }
        return res;
    }
}
