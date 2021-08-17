package Java基础.进制转换;

public class Demo {
    public static void main(String[] args) {
        //十进制转二进制
        int num = 10;
        String bin = "";
        while (num != 0) {
            bin = num % 2 + bin;
            num = num/2;
        }
        System.out.println("10的二进制"+bin);
        //二进制转十进制
        System.out.println(Integer.parseInt(bin,2));

    }


}
