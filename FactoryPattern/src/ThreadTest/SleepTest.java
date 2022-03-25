package ThreadTest;

/**
 * @Author 空白
 * @Date 2021/9/9 22:17
 * @Version 1.0
 */
public class SleepTest {
    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(1000*5);
        System.out.println(Thread.currentThread().getName());
    }
}
