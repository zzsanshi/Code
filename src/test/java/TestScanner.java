import java.util.Scanner;

public class TestScanner {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        while (cin.hasNext()) {
            int k = cin.nextInt();
            System.out.println("K:"+k);
        }
    }
}
