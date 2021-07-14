package 剑指;

import java.util.Deque;
import java.util.LinkedList;

public class _31栈的压入弹出序列 {
    //模拟栈
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Deque<Integer> stack = new LinkedList<>();
        int i = 0;
        for (int num : pushed) {
            stack.addFirst(num);
            while(!stack.isEmpty() && stack.peekFirst() == popped[i]) {
                stack.removeFirst();
                i++;
            }
        }
        return stack.isEmpty();
    }
}
