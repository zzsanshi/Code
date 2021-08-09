package Java基础.多线程;

import java.security.PublicKey;
import java.util.concurrent.*;

public class CyclicBarrierDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException, BrokenBarrierException {
        CyclicBarrier cyclicBarrier = new CyclicBarrier(2);
        ExecutorService executorService = new ThreadPoolExecutor(2, 2, 0,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(15),
                new ThreadPoolExecutor.DiscardPolicy());

        System.out.println("1");
        for (int i = 0; i < 4; i++) {
             executorService.submit(new RunnableDemo(cyclicBarrier) );
        }
        System.out.println("2");
        executorService.shutdown();
    }
}
class RunnableDemo implements Runnable{
    CyclicBarrier cyclicBarrier;
     public RunnableDemo(CyclicBarrier cyclicBarrier) {
        this.cyclicBarrier = cyclicBarrier;
    }
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
        try {
            System.out.println("等待");
            cyclicBarrier.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (BrokenBarrierException e) {
            e.printStackTrace();
        }
        System.out.println("所有线程写入完毕，继续处理其他任务...");
    }
}