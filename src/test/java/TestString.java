import java.lang.reflect.Field;

public class TestString {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        // 创建字符串"Hello World"， 并赋给引用s
        String s = "Hello World";
        String s2 = "Hello World";
        String s1 = new String(s).intern();
        System.out.println(s2== s1);
        System.out.println(s== s2);

    }
}
