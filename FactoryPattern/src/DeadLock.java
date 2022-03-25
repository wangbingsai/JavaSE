/**
 * @Author 空白
 * @Date 2021/9/11 19:44
 * @Version 1.0
 */
public class DeadLock {
    public static void main(String[] args) {
        Object o = new Object();
        Object o1 = new Object();
        MyThread1 myThread1 = new MyThread1(o,o1);
        MyThread2 myThread2 = new MyThread2(o,o1);
        myThread1.start();
        myThread2.start();

    }
}
class MyThread1 extends Thread{
    private Object obj1;
    private Object obj2;
    public MyThread1() {
    }

    public MyThread1(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    @Override
    public void run() {
    synchronized (obj1){
        System.out.println("o1");

        synchronized (obj2){

        }
    }
    }

}
class MyThread2 extends Thread{
     Object obj1;
     Object obj2;
    public MyThread2() {
    }

    public MyThread2(Object obj1, Object obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }
    @Override
    public void run() {
        synchronized (obj2){
            System.out.println("o1");

            synchronized (obj1){

            }
        }
    }
}