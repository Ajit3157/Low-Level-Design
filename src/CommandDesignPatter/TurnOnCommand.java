package CommandDesignPatter;

public class TurnOnCommand implements Command{

    Light lt;
    public TurnOnCommand(Light lt) {
        this.lt = lt;
    }
    @Override
    public void execute() {
        lt.turnOn();
    }

    @Override
    public void undo() {
        lt.turnOff();
    }
}
