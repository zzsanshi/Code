import java.util.*;

public class _589 {
    public static void main(String[] args) {
        Node root =new Node();


        List<Integer> res = new  ArrayList<>();
        Deque<Node> stack = new LinkedList<>();
        if (root == null) {
            return;
        }
        stack.addFirst(root);
        Node node =new Node();
        while (!stack.isEmpty()) {
            node = stack.removeFirst();
            res.add(node.val);
            Collections.reverse(node.children);
            for (Node child: node.children
                 ) {
                stack.addFirst(child);
            }
        }




    }
}
class Node {
    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }
}