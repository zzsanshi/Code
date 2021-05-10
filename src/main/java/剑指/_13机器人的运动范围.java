package 剑指;

public class _13机器人的运动范围 {
    public int movingCount(int m, int n, int k) {
        int[][] visited = new int[m][n];
        return backtracing ( m, n, 0, 0, k,visited);
        }
    int backtracing (int m, int n, int i, int j, int k, int[][] visited) {
        if(i < 0 || i >= m  || j < 0 || j >= n ) {
            return 0;
        }
        if(visited[i][j] == 1) {
            return 0;
        }
        int sum = 0;
        int temp1 = i;
        int temp2 = j;
        while(temp1 != 0 || temp2 != 0) {
            sum += temp1 % 10;
            sum += temp2 % 10;
            temp1 /= 10;
            temp2 /= 10;
        }
        if (sum > k ) {
            return 0;
        }
        visited[i][j] = 1;
        int  res1 = backtracing ( m, n, i+1, j, k, visited) + backtracing ( m, n, i-1, j, k,visited);
        int  res2 = backtracing ( m, n, i, j+1, k, visited) + backtracing ( m, n, i, j-1, k, visited);
        //visited[i][j] = 0;
        //并不是求路径不需要返回
        return res1 + res2 + 1;
    }
}

