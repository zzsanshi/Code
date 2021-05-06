package Thread_多线程;

public class ThreadTest {
    public static void main(String[] args) {
        CommonLock commonLock = new CommonLock();
        Thread threada = new Thread(new PrintThread("a", commonLock, "b"));
        Thread threadb = new Thread(new PrintThread("b", commonLock, "c"));
        Thread threadc = new Thread(new PrintThread("c", commonLock, "a"));
        threada.start();
        threadb.start();
        threadc.start();
    }
}
class CommonLock {
    public String activeName = "a";
}

class PrintThread implements Runnable {
    private String name;
    private CommonLock commonLock;
    private String next;
    public PrintThread(String name, CommonLock commonLock,String next) {
        this.name = name;
        this.commonLock = commonLock;
        this.next = next;
    }

    @Override
    public void run() {
        while (true) {
            synchronized (commonLock){
                if(this.name.equals(commonLock.activeName)) {
                    System.out.println( name );
                    commonLock.activeName = next;
                    commonLock.notifyAll();
                }
                else {
                    try {
                        commonLock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }

    }
}