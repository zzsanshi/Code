package 代码回想录.动态规划.子序列;

public class _115不同的子序列 {
    public int numDistinct(String s, String t) {
        int n1 = s.length();
        int n2 = t.length();
        int[][] dp = new int[n1][n2];
        char c1 = s.charAt(0);
        char c2 = t.charAt(0);
        if (c1 == c2) {
            dp[0][0] = 1;
        }
        for (int i = 1; i < s.length(); i++) {
            char c3 = s.charAt(i);
            if (c3 == c2) {
                dp[i][0] = dp[i-1][0] + 1;
            } else {
                dp[i][0] = dp[i-1][0];
            }
            for (int j = 1; j < t.length() ; j++) {
                  if (c3 == t.charAt(j)) {
                      dp[i][j] = dp[i-1][j-1] + dp[i-1][j] ;
                  } else {
                      dp[i][j] = dp[i-1][j];
                  }
            }
        }
        return dp[s.length()-1][t.length()-1];


    }
}
