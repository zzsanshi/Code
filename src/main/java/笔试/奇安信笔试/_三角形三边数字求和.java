package 笔试.奇安信笔试;

import java.util.Scanner;

public class _三角形三边数字求和 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String s =cin.nextLine();
            int j = 0;
            int[] nums = new int[9];
            for (Character c : s.toCharArray()){
                if(c!=','){
                    nums[j] = c-'0';
                    j++;
                }
            }
            int n1 = 0;
            int n2 = 0;
            int n3 = 0;
            for (int i = 0; i <=3 ; i++) {
                n1+=nums[i];
            }for (int i = 3; i <=6 ; i++) {
                n2+=nums[i];
            }for (int i = 6; i <9 ; i++) {
                n3+=nums[i];
            }
            n3+= nums[0];
            if(n1 == n2 && n2 == n3 && n1 == n3) {
                System.out.println("yes");
            } else {
                System.out.println("no");
            }
        }

    }
}
