package Java基础.多线程;

import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;

public class SemaphoreDemo {
    static Semaphore semaphore = new Semaphore(2, true);

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            //前10个同学都在耐心的等待打饭
            new Thread(new Exe(SemaphoreDemo.semaphore)).start();
        }
    }

}


class Exe implements Runnable {

    //许可--信号量
    private Semaphore semaphore;

    public Exe(Semaphore semaphore) {
        this.semaphore = semaphore;
    }

    @Override
    public void run() {
        //阻塞获取
        semaphore.acquireUninterruptibly();
        System.out.println(Thread.currentThread().getName());
        semaphore.release();

        //非阻塞获取
        try {
            if (semaphore.tryAcquire(1, TimeUnit.MILLISECONDS)) {
                System.out.println(Thread.currentThread().getName() + "非阻塞获得");
                semaphore.release();
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}