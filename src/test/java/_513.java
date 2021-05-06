import java.util.Deque;
import java.util.LinkedList;

public class _513 {
    public int findBottomLeftValue(TreeNode root) {
        int depth = 0;
        Deque<TreeNode> que = new LinkedList<>();
        que.addLast(root);
        TreeNode node ;
        int value = 0;
        while (!que.isEmpty()) {
            depth++;
            int size = que.size();
            for (int i = 0; i <size ; i++) {
                node = que.removeFirst();
                if( i == 0 ) {
                    value = node.val;
                }
                if(node.left != null) {
                    que.addLast(node.left);
                }
                if(node.right != null) {
                    que.addLast(node.right);
                }
            }
        }

        return value;
    }


}
