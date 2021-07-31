package leecode热门100题;

import java.util.Arrays;

/**
* Description:
 *
 给你一个整数数组 coins ，表示不同面额的硬币；以及一个整数 amount ，表示总金额。

 计算并返回可以凑成总金额所需的 最少的硬币个数 。如果没有任何一种硬币组合能组成总金额，返回 -1 。

 你可以认为每种硬币的数量是无限的。
* date: 2021/7/30 22:52
* @author: zzsanshi 
* @since JDK 14
*/
public class _322零钱兑换 {
        public int coinChange(int[] coins, int amount) {
        int max = amount + 1;
        int[] dp = new int[amount + 1];
        Arrays.fill(dp, max);
        dp[0] = 0;
        for (int i = 1; i <amount +1 ; i++) {
            for (int j = 0; j < coins.length; j++) {
                if(i - coins[j] >=0) {
                    dp[i] = Math.min(dp[i],1+ dp[i-coins[j]]);
                }
            }
        }
        return  dp[amount]>amount? -1 : dp[amount];

    }

}
