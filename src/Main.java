import ChainOfResponsibility.Debugger;
import ChainOfResponsibility.ErrorLog;
import ChainOfResponsibility.information;
import ChainOfResponsibility.logger;
import Decorator.*;

public class Main {
    public static void main(String[] args) {

       /* logger lg = new information(new Debugger(new ErrorLog(null)));
        lg.log("error" , "this is custom error");
        lg.log("info" , "this is custom info");
        lg.log("debug" , "this is custom debug"); */

        Notify nt = new WhatsappNotify(new TelegramNotify(new Notifier()));
        nt.send("Hey Product is available");
    }
}