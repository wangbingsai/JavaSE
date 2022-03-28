package work.yukong;

import java.util.Scanner;

/**
 * @Author 空白
 * @Date 2021/12/22 0:09
 * @Version 1.0
 */
public class Test001 {
}
class A{
    private int a ;

    public int  setA(int a,int b) {
        if (a!=1){
            this.a = a;
        }
    return a;

    }

    public int getA() {
        return a;
    }

    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.getA());
    }
}
class ThreadTest implements Runnable{

    @Override
    public void run() {

    }

    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer("a");
        sb.append("b");
        String string = "a";
        String str = new String("b");
        System.out.println(sb);
    }
}
abstract class B{
    public abstract void a();
    public void b(){

    }
}
class C extends B{

    @Override
    public void a() {
        System.out.println();
    }
}
