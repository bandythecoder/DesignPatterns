package TelescopingConstructor;

import java.util.ArrayList;
import java.util.List;

public class Person {
    String firstName;
    String lastName;
    List<Hobies> hobiesList;

    // Main Constructor

    public Person(String firstName, String LastName, List<Hobies> hobiesList)
    {
        this.firstName = firstName;
        this.lastName = LastName;
        this.hobiesList = hobiesList;
    }

    //
    public Person(String firstName)
    {
        this.firstName = firstName;
    }

    //
    public Person(String firstName , List<Hobies> hobies)
    {
        this(firstName);
        this.hobiesList = hobies;
    }

    public Person(String firstName , List<Hobies> hobies, String lastName)
    {
        this(firstName, hobies);
        this.lastName = lastName;
    }
}
