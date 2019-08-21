package transportation;

// ABSTRACT CLASS means you cannot INSTANTIATE (new "class name") it, will NEVER see that
// 
public abstract class AbstractVehicle
{
    // changed from private to protected
    // protected means that THIS current class AND ALL of its childs know about it too
    // (like public but restricted not as harsh as private though)
    protected int fuel;

    public AbstractVehicle(int fuel)
    {
        this.fuel = fuel;
    }

    // IF this does not exist, by DEFAULT when creating a constructor in its child class WITHOUT 
    // the given params like int like the one above AND in HorseFromAbstractVehicle 
    // (has a two constructors one with required params n without) WILL THROW ERROR, 
    // IF this constructor does exist, SET the REQUIRED int fuel to equal 1;
    public AbstractVehicle()
    {
        fuel = 1;
    }

    // REQUIRES: any class that extends/inherit from this abstract class has to implement these methods
    // abstract methods are NOT required for abstract classes, but if they are here have to USE them
    public abstract String getPath();
    public abstract String getName();

    public void move()
    {
        fuel--;
    }

    public void move(int steps)
    {
        fuel = fuel - steps;
    }

    public int getFuel()
    {
        return fuel;
    }

    public void addFuel(int fuel)
    {
        this.fuel += fuel;
    }
}