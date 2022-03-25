package ThreadTest;


import java.util.Date;
import java.util.Timer;
import java.util.TimerTask;

/**
 * @Author 空白
 * @Date 2021/9/11 21:53
 * @Version 1.0
 */
public class TimerTest {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer(true);
        timer.schedule(new MyThread03(), new Date(),1000);
        for (int i = 0; i < 10; i++) {
            Thread.sleep(1000);
            System.out.println("main"+i);
        }
    }
}
class MyThread03 extends TimerTask{

    @Override
    public void run() {
        System.out.println(new Date()+"执行");
    }
}
