package BehavioralPattern.StrategyPattern;

import java.util.Scanner;

public class Demo
{
    public static void main(String[] args)
    {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the player Name - ");
        var input = scn.next();
        Player p = PlayerFactory.createPlayer(input);
        p.jump();
        p.attack();
        p.fly();
    }
}

