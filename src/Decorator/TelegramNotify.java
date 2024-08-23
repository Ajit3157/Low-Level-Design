package Decorator;
public class TelegramNotify extends NotifyDecorator{
    public TelegramNotify(Notify notify) {
        super(notify);
    }
    @Override
    public void send(String msg) {
       nt.send(msg);
       System.out.println("Sent on telegram " + msg);
    }
}
