package ChainOfResponsibility;

public class information extends logger{
    public information(logger lg){
        super(lg);
    }
    @Override
    public void log(String key, String message) {
        if(key.toLowerCase().contains("info")){
            System.out.println("information " + message);
        }else if(lg != null){
            lg.log(key,message);
        }
    }
}
