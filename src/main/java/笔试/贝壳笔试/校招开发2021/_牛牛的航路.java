package 笔试.贝壳笔试.校招开发2021;

import java.util.Scanner;

public class _牛牛的航路 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()) {
            int n = cin.nextInt();
            int m = cin.nextInt();
            cin.nextLine();
            int[][] path = new int[m][3];
            for (int i = 0; i < m; i++) {
                String[] s = cin.nextLine().trim().split(" ");
                path[i][0] = Integer.valueOf(s[0]);
                path[i][1] = Integer.valueOf(s[1]);
                int a = Integer.valueOf(s[2]);
                int b = Integer.valueOf(s[3]);
                if(a== b) {
                    path[i][2] = 1;
                } else {
                    path[i][2] = jiecheng(a)/(jiecheng(b)*jiecheng(a-b));
                }

            }
            for (int i =  1; i <=n ; i++) {
                boolean[] visited = new boolean[n+1];
                dfs(i,visited,path);
            }
        }

    }
    static void dfs(int node,boolean[] visited,int[][] path) {
        if(visited[node] == true) {
            return;
        }
        visited[node] = true;
        for (int i = 0; i < path.length; i++) {
            if(path[i][2] !=0) {
                if(path[i][0] == node ) {
                    int next = path[i][1];
                    if(visited[next] == true){

                    }
                }else if(path[i][1] == node) {

                }

            }


        }
    }
    static int jiecheng(int n) {
        int sum = 1;
        while(n!=0) {
            sum*=n;
            n--;
        }
        return sum;
    }
}
