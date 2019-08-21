package transportation;

public class Horse implements Animal, Vehicle // implementing usually means an interface
// also implementation means that THIS CLASS takes in the BEHAVIORS (METHODS) of the interfaces used
{
    // fields - attributes - state
    private int fuel = 0;
    private String name;

    // default constructor - DEFAULT CONSTRUCTOR MEANS NO PARAMS - does nothing
    // just a sidenote - for spring to work ALWAYS have to include a default constructor
    public Horse()
    {

    }

    // Constructor - initial state
    // sidenote - AS LONG AS THE PARAMETERS ARE UNIQUE CAN HAVE AS MANY CONSTRUCTORS AS YOU WANT
    public Horse(String name)
    {
        this.name = name;
    }

    // implement the animal interface
    // sidenote - HAVE TO USE OVERRIDE because we defaulted the interface (they have no public/private)
    @Override
    public void move()
    {

    }

    @Override
    public void eat(int taco)
    {

    }

    @Override
    public String speak()
    {

    }

    // implement the vehicle interface
    @Override
    public String getPath()
    {

    }

    // CAN ONLY DECLARE IT ONCE BECAUSE THE PARAMS ARE THE SAME IF THEY R DIFFERENT CAN DECLARE TWICE
    // @Override
    // public void move()
    // {

    // }

    @Override
    public int getFuelLevel()
    {

    }

    @Override
    public void addFuel(int fuel)
    {

    }
}