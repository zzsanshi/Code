package Java基础.多线程;

import java.util.concurrent.atomic.AtomicInteger;

public class VolitaleDemo {
    AtomicInteger atomicInteger = new AtomicInteger(0);
    volatile int num = 0;

    void set() {
        //num.incrementAndGet();
        atomicInteger.incrementAndGet();
        num++;
    }

    public static void main(String[] args) {
        VolitaleDemo demo = new VolitaleDemo();
        for (int i = 0; i < 2; i++) {
            new Thread(() -> {
                for (int j = 0; j < 100; j++) {
                    demo.set();
                }
            }).start();
        }
        System.out.println("ss" + demo.num);
        System.out.println("ss" + demo.atomicInteger);
    }
}
