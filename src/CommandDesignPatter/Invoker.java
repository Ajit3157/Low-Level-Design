package CommandDesignPatter;

import java.util.Stack;

public class Invoker {

    Stack<Command>st = new Stack<>();
    Command command;
    public Invoker(Command command) {
        this.command = command;
    }
    public void setCommand(Command command) {
        this.command = command;
    }
    public void execute(){
        command.execute();
        st.push(command);
    }
    public void undo(){
       if(!st.isEmpty()){
           command = st.pop();
           command.undo();
       }
       else System.out.println("Nothing to undo");
    }
}
