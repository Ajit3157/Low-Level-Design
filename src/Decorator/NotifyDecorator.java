package Decorator;

public abstract class NotifyDecorator implements Notify{
    Notify nt;
    public NotifyDecorator(Notify nt){
        this.nt = nt;
    }
    public abstract void send(String msg);
}
