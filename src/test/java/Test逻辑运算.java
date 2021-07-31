public class Test逻辑运算 {
    public static void main(String[] args) {
        boolean flag = false | false | true & false;
        boolean flag1 = false | false | true;
        boolean flag2 = false | false | true & false | true;
        System.out.println(flag);
        System.out.println(flag1);
        System.out.println(flag2);
    }
}
