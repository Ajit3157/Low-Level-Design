package ChainOfResponsibility;

public abstract class logger {

    logger lg;
    public logger(logger lg) {
        this.lg = lg;
    }
    public abstract void log(String key , String message);

}
