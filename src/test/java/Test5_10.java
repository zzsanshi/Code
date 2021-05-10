public class Test5_10 {
    public static void main(String[] args) {
        int sum = 0;
        int temp1 = 35;
        int temp2 = 38;
        while(temp1 != 0 || temp2 != 0) {
            sum += temp1 % 10;
            sum += temp2 % 10;
            temp1 /= 10;
            temp2 /= 10;
        }
        System.out.println(sum);
    }
}




