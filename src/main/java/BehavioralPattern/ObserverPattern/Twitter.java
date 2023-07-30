package BehavioralPattern.ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Twitter
{
    List<User> users = new ArrayList<>();
    int count;
    public void registerUser(User user)
    {
        users.add(user);
    }

    public void removeUser(User user)
    {
        if(users.contains(user))
        {
            users.remove(user);
        }
    }



    public void incrementCount()
    {
        count++;
        notifyUsers();
    }

    private void notifyUsers()
    {
        for(var v : users)
        {
            v.printMessage(count);
        }
    }


}
