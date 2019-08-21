package transportation;

import java.util.*;

public class Main
{
    // typing -> pvm -> results in 
    // private void name() {
        
    // }

    // typing -> pvstm -> results in
    // private static Type name() {
        
    // }

    // typing -> pbcm -> results in
    // public void name() {
        
    // }

    // typing -> pbcsm -> results in
    // public static void name() {
        
    // }

    public static void main(String[] args)
    {
        Horse seabiscuit = new Horse("Kong");
        Horse bartholomus = new Horse("Tim");
        Horse doug = new Horse("Kevin");

        seabiscuit.eat(10);
        bartholomus.eat(25);
        seabiscuit.move();
        seabiscuit.move();

        System.out.println("seabiscuit's fuel level " + seabiscuit.getFuelLevel());
        System.out.println("Kevin talk to me " + doug.speak());
    }
}