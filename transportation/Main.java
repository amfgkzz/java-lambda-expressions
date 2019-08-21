package transportation;

import java.util.*;

public class Main
{
    // COMMON WAY OF FILTERING to a list -> public ArrayList<AbstractVehicle> filterList;

    // Never instantiate an object of Main, so this method HAS to be a class method AND HAS to be static
    public static void printVehicles(ArrayList<AbstractVehicle> vehicles, CheckVehicle tester) 
    {
        for ( AbstractVehicle v : vehicles )
        {
            if ( tester.test(v) )
            {
                System.out.println(v);
                // Add in more code to work, but this is a common way of filtering -> filterList.add(v);
            }
        }
    }

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

        System.out.println();

        System.out.println("*** Abstract Classes ***");
        HorseFromAbstractVehicle doodoo = new HorseFromAbstractVehicle("Anthony", 10);
        doodoo.addFuel(10);
        System.out.println("doodoo " + doodoo.getFuel());

        HorseFromAbstractVehicle corey = new HorseFromAbstractVehicle("Corey");
        HorseFromAbstractVehicle bao = new HorseFromAbstractVehicle("Bao", 5);
        HorseFromAbstractVehicle koua = new HorseFromAbstractVehicle("Koua", 20);
        HorseFromAbstractVehicle tim = new HorseFromAbstractVehicle("Tim", 11);
        tim.move(10);
        tim.addFuel(3);

        System.out.println(tim.getName() + " is moving " + tim.getFuel());
        System.out.println(tim);

        Auto car = new Auto(1, "Subaru", 2004);
        System.out.println(car);

        Auto gti = new Auto(0, "Vw gti", 2013);
        Auto honda = new Auto(100, "honda civic", 1999);
        
        honda.move(50);
        gti.addFuel(10);

        System.out.println(gti.getName() + " fuel level " + gti.getFuel());
        System.out.println(honda.getName() + " fuel level " + honda.getFuel());

        // the whole point of this lesson WITH ABSTRACT classes
        System.out.println("*** ArrayList ***");
        System.out.println();

        ArrayList<AbstractVehicle> myList = new ArrayList<AbstractVehicle>();

        myList.add(car);
        myList.add(gti);
        myList.add(honda);
        myList.add(tim);
        myList.add(corey);
        myList.add(bao);
        myList.add(koua);

        System.out.println(myList.toString());
        System.out.println();

        System.out.println("*** Lambda Expressions ***");
        System.out.println();
        // filtering
        printVehicles(myList, v -> v.getFuel() < 10); // THIS IS " -> " A LAMBDA EXPRESSION, 
        // IT WILL RETURN A BOOLEAN FOR ALL THE VEHICLES ON WHETHER THEY ARE BELOW 10 OR NOT
        // THAT GET FUEL LEVEL < 10 IS THE TEST!!! 
        System.out.println();
        printVehicles(myList, v -> v.getFuel() >= 10);
        System.out.println();
        // filter fuel < 10, and are horse
        printVehicles(myList, v -> (v.getFuel() < 10) && (v instanceof HorseFromAbstractVehicle)); // instance of this particular class
        
        System.out.println();
        myList.forEach((v) -> System.out.println(v));
        System.out.println();

        // myList.sort((v1, v2) -> )

    }
}