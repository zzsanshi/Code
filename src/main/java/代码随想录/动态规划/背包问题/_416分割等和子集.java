package 代码随想录.动态规划.背包问题;
/**
* Description:
 * 给你一个 只包含正整数 的 非空 数组 nums 。请你判断是否可以将这个数组分割成两个子集，使得两个子集的元素和相等。
* date: 2021/8/1 12:16
* @author: zzsanshi
* @since JDK 14
*/
import java.util.stream.IntStream;
//01背包问题
public class _416分割等和子集 {
    public boolean canPartition(int[] nums) {
        int sum =  IntStream.of(nums).sum();
        if( sum % 2 != 0) {
                return false;
        }

        int bagweight = sum/2;
        //dp[i]为 容量为i的背包所背的最大价值
        int[] dp = new int[bagweight+1];
        for (int i = 0; i < nums.length ; i++) {
            for (int j = bagweight; j >= nums[i] ; j--) {
                dp[j] = Math.max(dp[j], dp[j-nums[i]]+nums[i]);
            }
        }
        if (dp[bagweight] == bagweight) {
            return true;
        }
        return false;
    }
}
