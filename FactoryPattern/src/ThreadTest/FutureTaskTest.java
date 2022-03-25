package ThreadTest;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @Author 空白
 * @Date 2021/9/11 22:21
 * @Version 1.0
 */
public class FutureTaskTest {
    public static void main(String[] args){
        FutureTask futureTask = new FutureTask(new MyThread04());
        Thread thread = new Thread(futureTask);
        thread.start();
        Object o = null;
        try {
            o = futureTask.get();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println(o);

    }
}
class MyThread04 implements Callable{

    @Override
    public Object call() throws Exception {
        System.out.println("call-->begin");
            Thread.sleep(1000*6);
        System.out.println("call-->over");
        return 3;
    }
}