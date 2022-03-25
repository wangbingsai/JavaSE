package test;

/**
 * @Author 空白
 * @Date 2021/8/9 17:02
 * @Version 1.0
 */
public class Main {
    public static void main(String[] args) {
        SalesTicket s = new SalesTicket();
        FootDecorator f = new FootDecorator(s);
        Decorator T = new HeadDecorator(f);
        T.printTicket()  ;
        System.out.println("------------------------");
        T = new HeadDecorator( new FootDecorator (null));
        T.printTicket();
    }
}
