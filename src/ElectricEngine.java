
public class ElectricEngine extends Engine {
	private double batteryCapacity;

    public ElectricEngine(double batteryCapacity,  double displacement,  int cylinders) {
//    	sets the engine fuel type in the superclass
        super("Electric", displacement, cylinders);
        this.batteryCapacity = batteryCapacity;
    }

}
