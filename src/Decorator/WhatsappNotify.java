package Decorator;

public class WhatsappNotify extends NotifyDecorator{

    public WhatsappNotify(Notify notify) {
        super(notify);
    }
    @Override
    public void send(String msg) {
        nt.send(msg);
        System.out.println("message is sent on whatsapp " + msg);
    }
}
