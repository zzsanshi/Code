package Java基础.多线程;

import java.util.concurrent.*;

public class CountDownLatchDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        CountDownLatch latch = new CountDownLatch(4);
        ExecutorService executorService = new ThreadPoolExecutor(2,2,0,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(15),
                new ThreadPoolExecutor.DiscardPolicy());

        System.out.println("1");

        for (int i = 0; i <4; i++) {
            Future<String> futureTask = executorService.submit(new CallableDemo());

            System.out.println(futureTask.get());
            latch.countDown();
        }
        System.out.println("2");
        latch.await();
        System.out.println("3");
        executorService.shutdown();
    }
}
