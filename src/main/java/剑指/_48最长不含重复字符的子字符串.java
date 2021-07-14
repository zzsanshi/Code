package 剑指;

import java.util.HashSet;
import java.util.Set;

public class _48最长不含重复字符的子字符串 {
    public int lengthOfLongestSubstring(String s) {
        int[] dp = new int[s.length()];
        dp[0] = 1;
        int res = 0;
        for (int i = 1; i < dp.length; i++) {
            int j = i -1;
            while(j >= 0 && s.charAt(i) != s.charAt(j)) {
                j--;
            }
            dp[i] = dp[i-1] < i - j ? dp[i-1]+1: j-i;
            res = Math.max(dp[i],res);
        }
        return res;
    }

}
