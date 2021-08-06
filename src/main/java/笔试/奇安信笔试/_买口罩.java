package 笔试.奇安信笔试;

import java.util.Scanner;
//回溯
public class _买口罩 {
    static int res = 0;
    public static void main(String[] args) {
        int[][] info = new int[][]{{1,5},{2,3},{2,3},{2,2},{5,4},{3,1}};
        Scanner cin = new Scanner(System.in);
        while(cin.hasNext()) {
            int n = cin.nextInt();
            res = 0;
            int money = 0;
            int num = 0;
            boolean[] used = new boolean[6];
            backtracing(info,money,n,num,used,0);
            System.out.println(res);
        }
    }
    static void backtracing(int[][] info,int money,int n,int num,boolean[] used,int inx) {
        if(money == n) {
            res = Math.max(res,num);
            return ;
        }
        if(money > n) {
            return;
        }
        res = Math.max(res,num);
        for (int i = inx; i < info.length; i++) {
            if(used[i] == false) {
                used[i] = true;
                num += info[i][1];
                money += info[i][0];
                backtracing(info,money,n,num,used,i+1);
                used[i] = false;
                num -= info[i][1];
                money -= info[i][0];
            }
        }
    }
}
