import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflect {
    public static void main(String[] args) throws NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Demo d1 = new Demo(3);
        Class clz = d1.getClass();
        Method method = clz.getMethod("getNum");
        Constructor con2 = clz.getDeclaredConstructor(int.class);
        Constructor con1 = clz.getConstructor();
        Object demo = con1.newInstance();
        Object demo1 = con2.newInstance(2);
        method.invoke(d1);

    }
}

class Demo {
    static int num;

    static {
        System.out.println("实例化");
    }

    public Demo() {
        num = 0;
    }

    public Demo(int a) {
        num = a;
    }

    public int getNum() {
        System.out.println(num);
        return num;
    }

    public void setNum(int num) {
        this.num = num;

    }
}