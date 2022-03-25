import jdk.internal.org.objectweb.asm.commons.Method;

/**
 * @Author 空白
 * @Date 2021/9/21 1:31
 * @Version 1.0
 */
public class TestKs {
    static int a =1;
    int b;
     int arr[] = new int[10];
    public static void main(String[] args) {
        System.out.println(a);
        TestKs testKs = new TestKs();
        testKs.doSome();
        
    }
    void doSome(){
        System.out.println(a);
        System.out.println(b);
    }
}
