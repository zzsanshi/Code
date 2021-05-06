package _239滑动窗口最大值;

public class Solution {
    public static void main(String[] args) {
        int k=3;
        int[] nums = {1,3,1,2,0,5};
        int n = nums.length;
        MyQueue de = new MyQueue();
        int[] result = new int[n-k+1];
        for (int i = 0; i < k; i++) {
            de.push(nums[i]);
        }
        result[0] = de.max();
        for (int i = k; i < nums.length; i++) {
            de.pop(nums[i - k]); // 滑动窗口移除最前面元素
            de.push(nums[i]); // 滑动窗口前加入最后面的元素
            result[i-k+1] = de.max(); // 记录对应的最大值
        }

    }
}
