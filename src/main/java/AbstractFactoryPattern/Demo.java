package AbstractFactoryPattern;

import java.util.Scanner;

public class Demo {

    public static void main(String[] args)
    {

        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Your Marks - ");
        var input = scn.next();

        UniversityFactory universityFactory =  UniversityFactory.getFactory(Double.parseDouble(input));

        // get Admit Card
        System.out.println("Get Admit Card");
        universityFactory.getAdmitCard().getAdmitCard();

        System.out.println("Getting the Fee - " + universityFactory.getFeeCalculator().calculateFee() );
    }
}

