package test;

/**
 * @Author 空白
 * @Date 2021/8/9 17:01
 * @Version 1.0
 */
public class FootDecorator extends Decorator{
    public FootDecorator(SalesTicket t) {
        super(t);

    }
    @Override
    public void printTicket() {
        super.printTicket();
        System.out.println("这是票据的脚注！");
    }
}
