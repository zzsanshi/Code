package Java基础.反射;

public class ReflectDemo {


    public static void main(String[] args) throws ClassNotFoundException {

        Class clz = Demo.class;
        System.out.println("====");
        Class clz1 = Class.forName("Java基础.反射.Demo");
        System.out.println("====");
        Demo demo = new Demo();
        Class clz2 = demo.getClass();
    }



}

