package transportation;

public class Horse implements Animal, Vehicle // implementing usually means an interface
// also implementation means that THIS CLASS takes in the BEHAVIORS (METHODS) of the interfaces used
{
    // fields - attributes - state
    private int fuel = 0;
    private String name;

    // Constructor - initial state
    public Horse(String name)
    {
        this.name = name;
    }

    // implement the interfaces
    
}