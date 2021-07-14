package 剑指;
//模拟边界
public class _29顺时针打印矩阵 {
    public int[] spiralOrder(int[][] matrix) {
        //判断边界
        if(matrix.length == 0) return new int[0];
        int l = 0, r = matrix[0].length - 1, t = 0, b = matrix.length - 1, x = 0;
        int[] res =  new int[ (r + 1) * (b + 1)];
        while (true) {
            for (int i = l; i <= r ; i++) {
                res[x++] = matrix[t][i];
            }
            //判断边界
            if(++t > b) {
                break;
            }

            for (int i = t; i <= b ; i++) {
                res[x++] = matrix[i][r];
            }
            if (--r < l) {
                break;
            }

            for (int i = r; i >= l ; i--) {
                res[x++] = matrix[b][i];
            }
            if (--b < t) {
                break;
            }

            for (int i = b; i >= t ; i--) {
                res[x++] = matrix[i][l];
            }
            if( ++l > r) {
                break;
            }
        }
        return res;
    }
}
