package transportation;

// interface is a TYPE of a class
// people who USE interface DECIDE "HOW"
// we, the developer of the interface DECIDE "WHAT"
public interface Animal
{
    // NOTICE: no public, private, by convention WITH INTERFACES, we usually let them default, up to CLASS to decide
    // can add them AND some do, but in our case we let the class decide
    void move(); // animal can move
    void eat(int i); // animal can eat, also have to give it how much it can eat
    String speak(); // animal can speak
    // Allows us to control what we mean by an animal ie the USE of interfaces
    // CAN implement multiple interfaces
}