package FactoryPattern;

import java.util.Scanner;

public class Game {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter Player Name - ");
        String input = scn.nextLine();
        AbstractMarioMaker m = new MarioMaker();
        GameManager gamer = new GameManager(m);
        gamer.startGame(input);
        System.out.println("jump/run");
        input = scn.nextLine();
        if (input.equals("jump")) gamer.performJump();
        else gamer.performRun();
    }


}
