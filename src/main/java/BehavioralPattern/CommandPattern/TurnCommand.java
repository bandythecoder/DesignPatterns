package BehavioralPattern.CommandPattern;

public class TurnCommand implements ICommand {
    private Light light;
    public TurnCommand(Light light)
    {
       this.light = light;
    }

    @Override
    public void execute() {
      light.on();
    }

    @Override
    public void undo() {
      light.off();
    }
}
