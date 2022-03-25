package ThreadTest;

/**
 * @Author 空白
 * @Date 2021/9/10 22:09
 * @Version 1.0
 */
public class StopTest {
    public static void main(String[] args) throws InterruptedException {
        Thread t = new Thread(new Thread01());
        //启动线程
        t.setName("t");
        t.start();
        //5秒后终止线程
        Thread.sleep(5000);
        //调用t线程的stop
        t.stop();

    }
}
class Thread01 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(Thread.currentThread().getName()+"-->"+i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }

    }
}
