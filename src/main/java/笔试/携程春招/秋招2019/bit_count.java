package 笔试.携程春招.秋招2019;

import java.util.Scanner;

public class bit_count {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            long n = cin.nextLong();
            int count =0;
            while(n!=0) {
                count++;
                n&=(n-1);
            }
            System.out.println(count);

        }
    }
}
