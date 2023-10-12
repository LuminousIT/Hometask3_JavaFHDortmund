
public class ElectricEngine extends Engine {
	private double batteryCapacity;

    public ElectricEngine(double batteryCapacity) {
//    	sets the engine fuel type in the superclass
        super("Electric");
        this.batteryCapacity = batteryCapacity;
    }

}
