package 剑指;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class _32_1从上到下打印二叉树 {
    public int[] levelOrder(TreeNode root) {
        if(root == null) return new int[0];
        //层序遍历
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> que = new LinkedList<>();
        que.offerLast(root);
        while(!que.isEmpty()) {
            TreeNode node = que.pollFirst();
            res.add(node.val);
            if(node.left != null) {
                que.offerLast(node.left);
            }
            if(node.right != null) {
                que.offerLast(node.right);
            }
        }
        int[] temp = new int[res.size()];
        for (int i = 0; i <res.size() ; i++) {
            temp[i] = res.get(i);
        }
        return temp;
    }
}
