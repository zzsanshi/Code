package 代码随想录.动态规划.子序列.回文;

public class _647回文子串 {
    public int countSubstrings(String s) {
        int n = s.length();
        if (n <= 1) {
            return 1;
        }
        int res = 0;
        boolean[][] dp = new boolean[n][n];
        for (int i = 0; i < n; i++) {
            dp[i][i] = true;
            res++;
        }
        for (int i = n-1; i >=0 ; i--) {
            char start = s.charAt(i);
            for (int j = i+1; j < n; j++) {
                char end = s.charAt(j);
                if(start == end) {
                  if( i+1 == j || dp[i+1][j-1] == true ){
                      dp[i][j] = true;
                      res++;
                  }
                }
            }
        }
        return res;
    }
}
