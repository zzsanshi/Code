import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int n = cin.nextInt();
            int A = cin.nextInt();
            int[][] orders = new int[n][3];
            String s = cin.nextLine();
            for (int i = 0; i < n; i++) {
                s = cin.nextLine();
                System.out.println(s);
                String[] s1 = cin.next().split(" ");

                orders[i][0] = Integer.valueOf(s1[0]);
                orders[i][1] = Integer.valueOf(s1[1]);
                orders[i][2] = Integer.valueOf(s1[2]);
            }
        }
    }
}
