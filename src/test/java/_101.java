import java.util.Deque;
import java.util.LinkedList;

public class _101 {
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        //
        return compare(root.left,root.right);
    }
    boolean compare(TreeNode left, TreeNode right) {
        if (left == null && right != null) return false;
        else if (left != null && right == null) return false;
        else if (left == null && right == null) return true;
        else if (left.val != right.val) return false;
        boolean outside = compare(left.left, right.right);
        boolean inside = compare(left.right,right.left);
        return outside && inside;
    }
    //第二种写法
    public boolean isSymmetric2(TreeNode root) {
        if (root == null) {
            return true;
        }
        Deque<TreeNode> que = new LinkedList<>();
        que.offerLast(root.left);
        que.offerLast(root.right);
        while (!que.isEmpty()) {
            TreeNode leftNode = que.removeFirst();
            TreeNode rightNode = que.removeFirst();
            if (leftNode == null && rightNode == null) {  // 左节点为空、右节点为空，此时说明是对称的
                continue;
            }
            if ( leftNode == null || rightNode == null || leftNode.val != rightNode.val) {
                return false;
            }
            que.push(leftNode.left);   // 加入左节点左孩子
            que.push(rightNode.right); // 加入右节点右孩子
            que.push(leftNode.right);  // 加入左节点右孩子
            que.push(rightNode.left);  // 加入右节点左孩子
        }
        return true;
    }
}
