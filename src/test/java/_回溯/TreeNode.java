package _回溯;

import java.util.*;

public class TreeNode {
    int val;
    TreeNode right;
    TreeNode left;

    public TreeNode() {
        this.right = new TreeNode();
        this.left = new TreeNode();
    }
    //递归写法
    //前序遍历
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preOrder(root, res);

        return res;
    }
    public  void preOrder(TreeNode root,  List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        preOrder(root.left,res);
        preOrder(root.right,res);
    }
    //中序遍历
    public List<Integer> inOrderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        preOrder(root, res);

        return res;
    }
    public  void inOrder(TreeNode root,  List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        inOrder(root.left, res);
        inOrder(root.right, res);
    }
    //后序遍历
    public List<Integer> postOrderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        postOrder(root, res);

        return res;
    }
    public  void postOrder(TreeNode root,  List<Integer> res) {
        if (root == null) {
            return;
        }
        res.add(root.val);
        postOrder(root.left,res);
        postOrder(root.right,res);
    }
    //非递归写法
    //前序遍历
    /*
    使用一个栈来存储结点，以便回到之前的父结点。
        1.不断往左子树深入并不断先打印值再入栈直到左叶子的空左孩子
        2.弹出栈顶，将指针指向它的右孩子
        3.循环1,2步骤直至栈为空且指针也为空（意思是当栈为空但指针不为空时，继续。
         比如当栈顶元素是二叉树的根节点时，就会出现这种情况，此时指针指向根结点的右孩子，但是栈为空）
     */
    void preOrder1(TreeNode root){
        if(root==null) return;
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        stack.addFirst(root);
        TreeNode node;
        while (!stack.isEmpty()){
            node = stack.removeFirst();
            System.out.println(node.val);
            if (node.right != null) {
                stack.addFirst(node.right);
            }
            if (node.left != null) {
            stack.addFirst(node.left);
            }
        }
    }

    //中序遍历
    /*
    1.不断往左子树深入并不断入栈直到左叶子的空左孩子
    2.弹出栈顶，打印值，并将指针指向它的右孩子
    3.循环1,2步骤直至栈为空且指针也为空
     */
    void inOrder(TreeNode root){
        if(root==null) return;
        Stack<TreeNode> s=new Stack<>();
        while (!s.isEmpty()||root!=null){
            while(root!=null){
                s.push(root);
                root=root.left;
            }
            if(!s.isEmpty()){
                TreeNode t = s.pop();
                System.out.print(t.val+" ");
                root=t.right;
            }
        }
    }
    //后序遍历
    /*
    后续遍历稍微复杂一些，因为当左孩子完成打印并从栈中弹出父结点的时候，此时需要判断右孩子需不需要打印，有两种情况：
        1.如果右孩子为空，或者右孩子已经完成了打印，则打印当前的结点
        2.如果右孩子未打印过，则需要将右孩子入栈
    这里设置一个指针last来标记上一次打印的结点，这样只要判断last是不是右孩子就知道右孩子打印过没有了
具体步骤为：
        1.不断往左子树深入并不断入栈直到左叶子的空左孩子
        2.弹出栈顶，如果右孩子为null或者last是右孩子，则打印当前值；如果不是，则将指针指向右孩子
        3.循环1,2步骤直至栈为空且指针也为空
     */
    void postOrder(TreeNode root){
        if(root==null) return;
        List<Integer> res = new ArrayList<>();
        Deque<TreeNode> stack = new LinkedList<TreeNode>();
        TreeNode node = new TreeNode();
        stack.addFirst(root);
        while(!stack.isEmpty()) {
            node = stack.removeFirst();
            res.add(node.val);
            if (node.left != null) {
                stack.addFirst(node.left);
            }
            if(node.right != null) {
                stack.addFirst(node.right);
            }
        }
        Collections.reverse(res);
        for(int i :res) {
            System.out.println(i);
        }
    }

    //层序遍历 自顶向下
    public List<Integer> levelOrder(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root != null) {
            queue.offer(root);
        }
        List<Integer> res = new ArrayList<>();
        TreeNode node;
        while (!queue.isEmpty()) {
            node= queue.poll();
            res.add(node.val);
            if (node.left != null)
                queue.add(node.left);
            if (node.right != null)
                queue.add(node.right);
        }
        return res;
    }
    //自底向上
    public List<Integer> levelOrder2(TreeNode root) {
        List<Integer> res = levelOrder(root);
        Collections.reverse(res);//将自定向下结果翻转一下
        return res;
    }

}
