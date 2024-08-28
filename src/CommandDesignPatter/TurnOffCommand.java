package CommandDesignPatter;

public class TurnOffCommand implements Command{

    Light lt;
    public TurnOffCommand(Light lt) {
        this.lt = lt;
    }
    @Override
    public void execute() {
        lt.turnOff();
    }

    @Override
    public void undo() {
        lt.turnOn();
    }
}
