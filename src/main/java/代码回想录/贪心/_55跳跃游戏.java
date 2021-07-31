package 代码回想录.贪心;

public class _55跳跃游戏 {
    public boolean canJump(int[] nums) {
        int cover = 0;
        if ( nums.length == 1) {
            return true;
        }
        for (int i = 0; i <= cover; i++) {
            cover = Math.max(i + nums[i] , cover);
            if (cover >= nums.length-1) {
                return true;
            }
        }
        return false;
    }
}
