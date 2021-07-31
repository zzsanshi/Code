package 代码回想录;

import java.util.Deque;
import java.util.LinkedList;

public class _239滑动窗口最大值 {
    public int[] maxSlidingWindow(int[] nums, int k) {
        MyQueue de = new MyQueue();
        int[] result = new int[nums.length-k+1];
        for (int i = 0; i < k; i++) {
            de.push(nums[i]);
        }
        result[0] = de.max();
        for (int i = k; i <nums.length ; i++) {
            de.pop(nums[i-k ]); // 滑动窗口移除最前面元素
            de.push(nums[i]); // 滑动窗口前加入最后面的元素
            result[i+1-k] = de.max(); // 记录对应的最大值
        }
        return result;
    }

}
class MyQueue {
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