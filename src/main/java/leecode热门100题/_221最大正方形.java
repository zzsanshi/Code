package leecode热门100题;

public class _221最大正方形 {
    public int maximalSquare(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        int m = matrix.length;
        int n = matrix[0].length;
        int res = Integer.MIN_VALUE;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                res = Math.max(res, dfs(matrix, i, j));
            }
        }
        return res * res;
    }
    //返回边长
    int dfs(char[][] matrix, int i, int j) {
        int m = matrix.length;
        int n = matrix[0].length;
        int a = i;
        int b = j;
        int length = 0;
        while (a < m && b < n && matrix[i][b] == '1' && matrix[a][j] == '1') {
            length++;
            a++;
            b++;
        }
        if (length <= 1) {
            return length;
        }
        return Math.min(length,1+dfs(matrix,i+1,j+1));
    }
}
