package Singleton;

public class LoggerThreadSafe {
    // example of eager Loading
    public static volatile LoggerThreadSafe logger = new LoggerThreadSafe();

    private LoggerThreadSafe() {
        if (logger != null) {
            throw new RuntimeException();
        }
    }

    public static LoggerThreadSafe getInstance() {
        synchronized (LoggerThreadSafe.class) {
            return logger;
        }
    }
}
