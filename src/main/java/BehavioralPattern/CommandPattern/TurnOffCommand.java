package BehavioralPattern.CommandPattern;

public class TurnOffCommand implements ICommand{
    private Light light;
    public TurnOffCommand(Light light)
    {
        this.light = light;
    }

    @Override
    public void execute()
    {
        light.off();
    }

    @Override
    public void undo() {
       light.on();
    }
}
