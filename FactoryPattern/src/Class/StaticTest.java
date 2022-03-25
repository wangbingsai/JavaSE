package Class;

/**
 * @Author 空白
 * @Date 2021/9/13 19:42
 * @Version 1.0
 */
public class StaticTest {
    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName("Class.Test");
    }
}
class Test{
    static{
        System.out.println("静态代码块执行!");
    }
}
