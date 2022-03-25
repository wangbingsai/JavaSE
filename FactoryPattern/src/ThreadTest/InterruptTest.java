package ThreadTest;

/**
 * @Author 空白
 * @Date 2021/9/9 22:41
 * @Version 1.0
 */
public class InterruptTest {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread(new MyThread1());
        thread.start();


        //终止休眠直接异常
        thread.interrupt();
    }
}
class MyThread1 implements Runnable{
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"--->begin");
        try {
            //休眠1小时
            Thread.sleep(1000*60*60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName()+"----->over");
    }
}
