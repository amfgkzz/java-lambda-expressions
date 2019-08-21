package transportation;

public interface Vehicle
{
    // USUALLY NO FIELDS - ATTRIBUTES - STATE in an interface
    String getPath(); // where vehicle is going <-- getter
    void move(); // vehicle is able to move <-- method - behavior
    int getFuelLevel(); // integer of fuel level in vehicle <-- getter
    void addFuel(int i); // CAN add fuel to vehicle using an integer <-- setter
}