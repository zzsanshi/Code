import java.util.Scanner;

public class Main1 {



        public static void main(String[] args) {
            Scanner cin = new Scanner(System.in);
            int T = cin.nextInt();
            int [][] t = new int[T][2];

                for (int i = 0; i < T ; i++) {
                    int a = cin.nextInt();
                    int b =cin.nextInt();
                    int n1 = -1;
                    int n2 = -1;
                    while (a != 0) {
                        a = a / 2;
                        n1++;
                    }
                    while ( b != 0) {
                        b = b / 2;
                        n2++;
                    }
                    System.out.println(n1 + n2);
                }



        }
    }

