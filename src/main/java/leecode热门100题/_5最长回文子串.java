package leecode热门100题;

public class _5最长回文子串 {
    public String longestPalindrome(String s) {
        int n = s.length();
        boolean[][] dp = new boolean[s.length()][s.length()];
        String res="";
        int max = Integer.MIN_VALUE;
        for (int i = n-1; i >= 0 ; i--) {
            for (int j = i; j < n ; j++) {
                if(s.charAt(i) == s.charAt(j)) {
                    if(j - i <= 1) {
                        dp[i][j] = true;
                        if(max < j - i){
                            max = j - i;
                            res = s.substring(i,j+1);
                        }
                    } else if (dp[i+1][j-1]) {

                        dp[i][j] = true;
                        if(max < j - i){
                            max = j - i;
                            res = s.substring(i,j+1);
                        }
                    }
                }
            }
        }
        return res;

    }
}
