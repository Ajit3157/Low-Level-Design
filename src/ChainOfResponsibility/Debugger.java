package ChainOfResponsibility;

public class Debugger extends logger{
    public Debugger(logger lg){
        super(lg);
    }
    @Override
    public void log(String key, String message) {
        if(key.toLowerCase().contains("debug")){
            System.out.println("debug " +message);
        }else if(lg != null){
            lg.log(key,message);
        }
    }
}
