package ChainOfResponsibility;

public class ErrorLog extends logger{

    public ErrorLog(logger lg) {
        super(lg);
    }
    @Override
    public void log(String key, String message) {
        if(key.toLowerCase().contains("error")){
            System.out.println("error " + message);
        }else if(lg != null){
            lg.log(key,message);
        }
    }
}
