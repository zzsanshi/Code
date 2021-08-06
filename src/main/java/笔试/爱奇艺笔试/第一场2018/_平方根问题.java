package 笔试.爱奇艺笔试.第一场2018;
/**
 * Description:
 * 考虑定义在两正整数上的函数SSR(平方根之和的平方):SSR(A, B) = (sqrt(A) + sqrt(B))^2。
 * 牛牛对函数值为整数的情况很感兴趣。现在给定整数n和m,请帮助牛牛计算有序对(A, B)的数量, 满足1 ≤ A ≤ n, 1 ≤ B ≤ m而且SSR(A, B)是一个整数
 * date: 2021/7/31 20:14
 *
 * @author: zzsanshi
 * @since JDK 14
 */

import java.util.Scanner;

public class _平方根问题 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int A = cin.nextInt();
            int B = cin.nextInt();
            //求A*B是平方数
            int res = 0;
            for (int i = 1; i <= A; i++) {
                for (int j = 1; j <= B; j++) {
                    double t = Math.sqrt(i * j);
                    if(t-(int)t== 0) {
                        res++;
                    }
                }
            }
            System.out.println(res);
        }
    }
}
