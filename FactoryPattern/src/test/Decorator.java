package test;

/**
 * @Author 空白
 * @Date 2021/8/9 16:58
 * @Version 1.0
 */
public class Decorator extends SalesTicket {
    SalesTicket ticket;
    public Decorator(SalesTicket t){
        ticket = t;
    }
    @Override
    public void printTicket(){
        if(ticket != null)
            ticket.printTicket();
    }
}
