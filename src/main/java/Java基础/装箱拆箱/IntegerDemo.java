package Java基础.装箱拆箱;

public class IntegerDemo {
    public static void main(String[] args) {
        System.out.println("-128~~127");
        Integer a = new Integer(3);
        Integer b = 3;//没有new Integer对象
        int c = 3;
        System.out.println(a == b); // false 两个引用没有引用同一对象
        System.out.println(a == c); // true a自动拆箱成int类型再和c比较
        System.out.println(b == c); // true
        //类似
        System.out.println("====");
        Integer a2 = 127;
        Integer b2 = 127;
        System.out.println(a2 == b2); // true

        System.out.println("====");
        Integer a3 = new Integer(127);
        Integer b3 = new Integer(127);
        System.out.println(a3==b3); // false

        System.out.println("==超出范围===");
        Integer a1 = 128;//自动装箱成Integer类型
        Integer b1 = 128;//自动装箱成Integer类型
        System.out.println(a1 == b1); // false
        System.out.println(a1.equals(b1)); // true

        Integer a4 = new Integer(128);
        Integer b4 = 128;//自动装箱成Integer类型
        System.out.println(a4==b4); // false

        Integer a5 = new Integer(128);
        int b5 = 128;
        System.out.println(a5==b5); // true自动拆箱

//        String s1 = "ss";
//        String s2 = new String("ss");
//        System.out.println(s1.equals(s2));
//        System.out.println(s1==s2);
    
    }
}
