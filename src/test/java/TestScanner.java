import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int m = cin.nextInt();
            int n = cin.nextInt();
            System.out.println(m+n);
        }
    }
}
