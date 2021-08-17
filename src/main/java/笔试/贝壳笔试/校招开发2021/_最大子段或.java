package 笔试.贝壳笔试.校招开发2021;

import java.util.Scanner;

public class _最大子段或 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            cin.nextLine();
            String[] s = cin.nextLine().split(" ");
            int[] num = new int[n];
            for (int i = 0; i < n; i++) {
                num[i] = Integer.valueOf(s[i]);
            }

                int[][] dp = new int[n][2];
                dp[0][0] = num[0];
                dp[0][1] = 1;
                int res = 1;
                int length = 1;
                for (int i = 1; i < n; i++) {
                    dp[i][0] = (dp[i - 1][0] | num[i]) > num[i] ? dp[i - 1][0] | num[i] : num[i];
                    dp[i][1] = (dp[i - 1][0] | num[i]) > num[i] ? dp[i - 1][1] + 1 : 1;
                    res = res < dp[i][0] ? dp[i][0] : res;
                    length = res < dp[i][0] ? dp[i][1] : length;
                    if (res == dp[i][0]) {
                        if (length > dp[i][1]) {
                            length = dp[i][1];
                        }
                    }
                }
                System.out.println(length);
        }
    }
}
