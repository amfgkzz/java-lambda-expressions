package transportation;

import java.util.*;

public class Main
{
    public static void main(String[] args)
    {
        Horse seabiscuit = new Horse("Kong");
        Horse bartholomus = new Horse("Tim");
        Horse bitch = new Horse("Kevin");

        seabiscuit.eat(10);
        bartholomus.eat(25);
        seabiscuit.move();
        seabiscuit.move();

        System.out.println("seabiscuit's fuel level " + seabiscuit.getFuelLevel());
    }
}