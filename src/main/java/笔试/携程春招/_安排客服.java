package 笔试.携程春招;

import java.lang.reflect.Array;
import java.util.Scanner;

public class _安排客服 {
    public static void main(String[] args) {
        Scanner cin =new Scanner(System.in);

        while(cin.hasNext()) {
            int n = cin.nextInt();
            int[][] tel = new int[n][2];
            for (int i = 0; i <n ; i++) {
                String[] s= cin.next().split(",");
                tel[i][0] = Integer.valueOf(s[0]);
                tel[i][1] = Integer.valueOf(s[1]);
            }
            for (int i = 0; i < n; i++) {
                System.out.println(tel[i][0]);
                System.out.println(tel[i][1]);
            }



        }
    }
}
