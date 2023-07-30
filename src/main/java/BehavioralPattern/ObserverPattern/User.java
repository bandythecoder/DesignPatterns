package BehavioralPattern.ObserverPattern;

public class User {
    public void printMessage(int count)
    {
        System.out.println(this + " Got update Count is now =" + count);
    }
}
