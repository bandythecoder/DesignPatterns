package BehavioralPattern.ObserverPattern;

public class demo {

    public static void main(String[] args)
    {
        User first = new User();
        User second = new User();
        User third = new User();

        Twitter twitter = new Twitter();
        twitter.registerUser(first);
        twitter.registerUser(second);
        twitter.registerUser(third);
        twitter.incrementCount();
        
    }
}
