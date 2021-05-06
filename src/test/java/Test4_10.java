import java.util.Scanner;

public class Test4_10 {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            String s1 = cin.nextLine();
            int k = cin.nextInt();
            String[] s = s1.trim().split(" ");
            int[] num = new int[s.length];
            for (int i = 0; i < s.length; i++) {
                num[i] = Integer.parseInt(s[i]);
                System.out.print(num[i]+",");
            }
            System.out.println();

            System.out.println("k:"+k);

        }
    }
}
