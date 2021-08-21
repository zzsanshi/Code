package 剑指Offer;

import java.util.Deque;
import java.util.LinkedList;

public class _30包含min函数的栈 {
    /** initialize your data structure here. */
    Deque<Integer> stack , min;
    public void MinStack() {
         stack = new LinkedList();
         min = new LinkedList();

    }

    public void push(int x) {
        stack.addFirst(x);
        if(min.isEmpty() || min.peekFirst() >= x) {
            min.addFirst(x);
        }
    }

    public void pop() {
        if( stack.removeFirst().equals(min.peekFirst())) {
            min.removeFirst();
        }
    }

    public int top() {
        return stack.peekFirst();
    }

    public int min() {
        return min.peekFirst();
    }
}
