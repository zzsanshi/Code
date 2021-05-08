package 回文;

public class _647回文子串 {
    public int countSubstrings(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[s.length()][s.length()];
        int res = 0;
        for (int i = n-1; i >= 0 ; i--) {
            for (int j = i; j < n ; j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    if(j - i <= 1) {
                        res++;
                        dp[i][j] = true;
                    } else if (dp[i+1][j-1]) {
                        res++;
                        dp[i][j] = true;
                    }
                }
            }
        }
        return res;

    }
}
