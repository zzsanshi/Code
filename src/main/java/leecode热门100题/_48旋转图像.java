package leecode热门100题;

public class _48旋转图像 {
    public void rotate(int[][] matrix) {
        int n = matrix.length;
        int temp = 0;
        int t = 0, b = n - 1, l = 0, r = n - 1;
        while (t <= b) {
                for (int i = 0; i < r- l; i++) {
                    temp = matrix[t][l+i];
                    //1-4
                    matrix[t][l+i] = matrix[b-i][l];
                    //4-3
                    matrix[b-i][l] = matrix[b][r-i];
                    //3-2
                    matrix[b][r-i] = matrix[t+i][r];
                    //2-t
                    matrix[t+i][r]= temp;

                }
                l++;
                r--;
                t++;
                b--;
        }

    }
}
