package 单例;

/**
 * Description:
 * 双检锁/双重校验锁 + volatile关键字
 * date: 2021/5/25 16:34
 *
 * @author: zzsanshi
 * @since JDK 14
 */
public class Singleton {
    private static volatile Singleton instance = null;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null) {
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
