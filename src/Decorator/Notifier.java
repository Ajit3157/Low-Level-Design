package Decorator;

public class Notifier implements Notify{
    @Override
    public void send(String msg) {
        System.out.println("Message is sent to Mobile " + msg);
    }
}
