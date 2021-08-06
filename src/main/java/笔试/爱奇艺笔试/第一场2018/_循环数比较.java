package 笔试.爱奇艺笔试.第一场2018;

import java.util.Scanner;

/**
 * Description:
 * 对于任意两个正整数x和k,我们定义repeat(x, k)为将x重复写k次形成的数,例如repeat(1234, 3) = 123412341234,repeat(20,2) = 2020.
 * 牛牛现在给出4个整数x1, k1, x2, k2, 其中v1 = (x1, k1), v2 = (x2, k2),请你来比较v1和v2的大小。
 * date: 2021/7/31 19:38
 *
 * @author: zzsanshi
 * @since JDK 14
 */
public class _循环数比较 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int x1 = cin.nextInt();
            int k1 = cin.nextInt();
            int x2 = cin.nextInt();
            int k2 = cin.nextInt();

            int n1 = comput(x1);
            int n2 = comput(x2);

            int res1 = merge(x1, (int) Math.pow(10, n1), k1);
            int res2 = merge(x2, (int) Math.pow(10, n2), k2);

            int res = res1 - res2;
            if (res == 0) {
                System.out.println("Equal");
            } else if (res < 0) {
                System.out.println("Less");
            } else {
                System.out.println("Greater");
            }
        }
    }

    //计算位数
    static int comput(int n) {
        int i = 0;
        while (n != 0) {
            n /= 10;
            i++;
        }
        return i;
    }
    //合并
    static int merge(int n, int m, int k) {
        int res = 0;
        for (int i = 0; i < k; i++) {
            res= res * m + n;
        }
        return res;
    }
}
