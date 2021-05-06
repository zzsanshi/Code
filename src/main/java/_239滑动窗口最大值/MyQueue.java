package _239滑动窗口最大值;

import java.util.Deque;
import java.util.LinkedList;

public class MyQueue {
    Deque<Integer> que = new LinkedList<>();

    void pop(int value) {
        if (!que.isEmpty() && value == que.peekFirst()) {
            que.pollFirst();
        }
    }
    void push(int value) {
        while(!que.isEmpty() && value > que.peekLast()) {
            que.pollLast();

        }
        que.offerLast(value);

    }
    int max() {
        return que.peekFirst();
    }

}
