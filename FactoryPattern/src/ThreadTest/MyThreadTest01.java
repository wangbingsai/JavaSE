package ThreadTest;

/**
 * @Author 空白
 * @Date 2021/9/8 21:00
 * @Version 1.0
 */
public class MyThreadTest01 {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        myThread.start();
        MyThread myThread1 = new MyThread();
        myThread1.start();
        Thread thread = Thread.currentThread();
        System.out.println("main-->"+thread.getName());
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        Thread thread = Thread.currentThread();
        System.out.println(thread.getName());
    }
    }

