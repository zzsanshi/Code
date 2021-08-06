package Java基础.反射;

public class Demo {
    static int a = 0;
    static {
        System.out.println("静态初始化!");
    }
    public Demo() {
        System.out.println("普通初始化!");
    }
}
