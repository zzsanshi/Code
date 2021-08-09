package JAVA命令;

public class JpsTest {
    public static void main(String[] args) throws InterruptedException {
        //创建资源
        final Object a = new Object();
        final Object b = new Object();
        //启动线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                //获取a的锁
                synchronized (a) {
                    try {
                        System.out.println("i'm t1");
                        //等待一会儿，确保下一个线程获得另一个资源对象锁
                        Thread.sleep(100);
                        //获取b的锁
                        synchronized (b) {
                            System.out.println("t1------");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        //启动线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                //获取b的锁
                synchronized (b) {
                    try {
                        System.out.println("i'm t2");
                        //等待一会儿，确保下一个线程获得另一个资源对象锁
                        Thread.sleep(100);
                        //获取a的锁
                        synchronized (a) {
                            System.out.println("t2------");
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }
}