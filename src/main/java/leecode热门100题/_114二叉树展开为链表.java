package leecode热门100题;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
//先序遍历
public class _114二叉树展开为链表 {
    public void flatten(TreeNode root) {
        if(root == null){
            return;
        }
        Deque<TreeNode> stack = new LinkedList<>();
        stack.addFirst(root);
        TreeNode temp;
        TreeNode Dum = new TreeNode(-1);
        while(!stack.isEmpty()) {
            temp = stack.removeFirst();
            if(temp.right != null) {
                stack.addFirst(temp.right);
            }
            if(temp.left != null) {
                stack.addFirst(temp.left);
            }
            Dum.right = temp;
            Dum= Dum.right;
            Dum.left = null;
        }
    }
}
