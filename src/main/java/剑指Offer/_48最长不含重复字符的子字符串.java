package 剑指Offer;

public class _48最长不含重复字符的子字符串 {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) {
            return 0;
        }
        int[] dp = new int[s.length()];
        dp[0] = 1;
        int res = 0;
        for (int i = 1; i < dp.length; i++) {
            int j = i -1;
            while(j >= 0 && s.charAt(i) != s.charAt(j)) {
                j--;
            }
            dp[i] = dp[i-1] < i - j ? dp[i-1]+1: i-j;
            res = Math.max(dp[i],res);
        }
        return res;
    }

}
