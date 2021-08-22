package test;

/**
 * @Author 空白
 * @Date 2021/8/9 17:00
 * @Version 1.0
 */
public class HeadDecorator extends Decorator{
    public HeadDecorator(SalesTicket t) {
        super(t);
    }
    @Override
    public void printTicket() {

        System.out.println("这是票据的台头！");
        super.printTicket();
    }
}
