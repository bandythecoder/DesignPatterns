package Singleton;

public class Logger
{
    // example of eager Loading
    public static Logger logger = new Logger();
    private Logger()
    {

    }

    public static Logger getInstance()
    {
        return logger;
    }
}


