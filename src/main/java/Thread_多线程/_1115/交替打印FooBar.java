package Thread_多线程._1115;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class 交替打印FooBar {

}

class FooBar {
    private int n;
    Lock lock = new ReentrantLock(true);
    private final Condition condition = lock.newCondition();
    volatile boolean flag = true;


    public FooBar(int n) {
        this.n = n;
    }

    public void foo(Runnable printFoo) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            lock.lock();
            try{
                while (!flag) {
                    condition.await();
                }
                printFoo.run();
                flag = false;
                condition.signal();
            }finally {
                lock.unlock();
            }
        }
    }

    public void bar(Runnable printBar) throws InterruptedException {

        for (int i = 0; i < n; i++) {
            lock.lock();
           try{ while(flag) {
               condition.await();
            }
            printBar.run();
            flag = true;
            condition.signal();
           }finally {
               lock.unlock();
           }
        }
    }


}

