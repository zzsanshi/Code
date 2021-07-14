package 剑指;

import java.util.Stack;

public class _36二叉搜索树与双向链表 {
    TreeNode pre, head;
    public TreeNode treeToDoublyList(TreeNode root) {
        if(root == null) {
            return null;
        }
        inOrder(root);
        head.left = pre;
        pre.right = head;
        return head;
    }
    void inOrder(TreeNode cur) {
        if(cur == null) {
            return;
        }
        inOrder(cur.left);
        if(pre != null) {
            pre.right = cur;
        }
        else {
            head = cur;
        }
        cur.left = pre;
        pre = cur;
        inOrder(cur.right);
    }
}
