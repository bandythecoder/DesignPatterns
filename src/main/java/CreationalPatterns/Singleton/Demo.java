package CreationalPatterns.Singleton;

import java.util.HashSet;
import java.util.Set;

public class Demo
{
    public static void main(String[] args)
    {
        Logger l = Logger.getInstance();
        Logger l1 = Logger.getInstance();

        System.out.println(l + " " +  l1);
        Thread[] array = new Thread[1000];
        Set<LoggerThreadSafeLazy> set = new HashSet<>();
        for(int i = 0; i < 1000; i++)
        {
            Thread th = new Thread(() -> set.add(LoggerThreadSafeLazy.getInstance()));
            array[i] = th;
        }

        for(var th : array)
        {
            th.start();
        }

        System.out.println(set.size());
    }
}
