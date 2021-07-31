package 代码回想录.贪心;

public class _45跳跃游戏2 {
    public int jump(int[] nums) {
        int maxPosition = 0;//未来边界
        int end = 0;//当前边界
        int step = 0;
        for (int i = 0; i <= nums.length-1; i++) {
            maxPosition = Math.max(maxPosition, i+nums[i]);//当前一步能达到的最大范围.
            if (end == i) {//到达边界
                step++;
                end = maxPosition;
            }
        }
        return step;
    }
}
