package Java基础.多线程;

import javax.xml.transform.Result;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class ThreadPoolDemo {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = new ThreadPoolExecutor(2,2,0,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(15),
                new ThreadPoolExecutor.DiscardPolicy());
        List<Future<String>> futureList = new ArrayList<Future<String>>();
        for (int i = 0; i <3; i++) {
            Future<String> futureTask = executorService.submit(new CallableDemo());
            //System.out.println(futureTask.get());
            futureList.add(futureTask);
        }
        for (int i = 0; i < futureList.size(); i++) {
            System.out.println(futureList.get(i));
            System.out.println(futureList.get(i).get());
        }
        //executorService.shutdown();

        System.out.println("====");
        //
        CompletionService ecs = new ExecutorCompletionService(executorService);
        for (int i = 0; i <4; i++) {
            ecs.submit(new CallableDemo());
        }
        for (int i = 0; i < 4; ++i) {// 获取每一个完成的任务
            try {
                System.out.println(ecs.take().get(1,TimeUnit.SECONDS));
            } catch (TimeoutException e) {
                e.printStackTrace();
            }
        }
        executorService.shutdown();
    }

}
class CallableDemo implements Callable{

    @Override
    public Object call() throws Exception {
        return Thread.currentThread().getName();
    }
}
