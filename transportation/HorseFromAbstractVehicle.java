package transportation;

public class HorseFromAbstractVehicle extends AbstractVehicle
{
    private String name;

    public HorseFromAbstractVehicle(String name, int fuel)
    {
        super(fuel); // super calls ITS parent constructor (in this case AbstractVehicle)
        this.name = name;
    }

    public HorseFromAbstractVehicle(String name)
    {
        // super(); // CALLS THIS BY DEFAULT FOR A CHILD CLASS when extending an abstract class <-- whether or not i have it
        this.name = name;
    }

    @Override
    public String getPath()
    {
        return "Grass";
    }

    @Override
    public String getName()
    {
        return name;
    }

    @Override
    public String toString()
    {
        return "HorseFromAbstractVehicle {"+ "name='" + name + '\'' + ", fuel=" + fuel + '}';
    }
}