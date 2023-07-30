package BehavioralPattern.CommandPattern;

import java.util.List;

public class Invoker
{
    List<ICommand> iCommandList;

    public void addCommand(ICommand command)
    {
        iCommandList.add(command);
    }

    public void execute()
    {
        for(var command : iCommandList)
        {
            command.execute();
        }
    }
}
