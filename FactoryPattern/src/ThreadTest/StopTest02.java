package ThreadTest;

/**
 * @Author 空白
 * @Date 2021/9/10 22:16
 * @Version 1.0
 */
public class StopTest02 {
    public static void main(String[] args) throws InterruptedException {
        Thread02 t02 = new Thread02();
        Thread t = new Thread(t02);
        //启动线程
        t.setName("t");
        t.start();
        //5秒后终止线程
        Thread.sleep(5000);
        //更改run属性,使得进入else语句块
        t02.run=false;
    }
}
class Thread02 implements Runnable{
    boolean run = true;
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            if (run) {
                System.out.println(Thread.currentThread().getName() + "-->" + i);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }else {
                return;
            }
        }
    }
}
