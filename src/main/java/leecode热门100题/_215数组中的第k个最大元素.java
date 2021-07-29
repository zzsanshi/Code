package leecode热门100题;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

public class _215数组中的第k个最大元素 {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> que = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });
        for (int i = 0; i < k; i++) {
            que.add(nums[i]);
        }
        for (int i = k; i < nums.length; i++) {
                if(nums[i] > que.peek()) {
                    que.poll();
                    que.add(nums[i]);
                }
        }
        return que.peek();
    }
}
