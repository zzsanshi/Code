package 剑指Offer;

import java.util.Deque;
import java.util.LinkedList;

public class _59队列的最大值2 {
    class MaxQueue {
        Deque<Integer> queue;
        Deque<Integer> deque;//单调栈记录大小

        public MaxQueue() {
            queue = new LinkedList<>();
            deque = new LinkedList<>();
        }

        public int max_value() {
            if (queue.isEmpty()) {
                return -1;
            } else {
                return deque.peekFirst();
            }

        }

        public void push_back(int value) {
            queue.addLast(value);
            while(!deque.isEmpty() && deque.peekLast()<value){
                deque.pollLast();
            }
            deque.addLast(value);
        }

        public int pop_front() {
            if(queue.isEmpty()) {
                return -1;
            }
            int value = queue.removeFirst();
            if (value == deque.peekFirst()) {
                deque.removeFirst();
            }
            return value;
        }
    }
}
