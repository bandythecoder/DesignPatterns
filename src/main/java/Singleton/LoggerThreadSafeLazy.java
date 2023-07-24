package Singleton;

public class LoggerThreadSafeLazy {
    // example of eager Loading
    public static volatile LoggerThreadSafeLazy logger;

    private LoggerThreadSafeLazy() {
        if (logger != null) {
            throw new RuntimeException();
        }
    }

    public static LoggerThreadSafeLazy getInstance() {
        if (logger == null) {
            synchronized (LoggerThreadSafe.class)
            {
                if(logger == null) logger = new LoggerThreadSafeLazy();
            }

        }
        return logger;
    }
}
