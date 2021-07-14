package 剑指;

public class _46礼物的最大价值 {
    public int maxValue(int[][] grid) {
        int n = grid[0].length;
        int m = grid.length;
        int[][] dp = new int[m][n];
        dp[0][0] = grid[0][0];
        for (int i = 1; i < n; i++) {
            dp[0][i] = grid[0][i] +dp[0][i-1];
        }
        for (int i = 1; i < m; i++) {
            dp[i][0] = grid[i][0] + dp[i-1][0];
        }
        for (int i = 1; i < m ; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i-1][j],dp[i][j-1])+grid[i][j];
            }
        }
        return dp[m-1][n-1];
    }
}
