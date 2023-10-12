
public class HybridEngine extends Engine {
	private double batteryCapacity;

    public HybridEngine(String fuelType, double batteryCapacity,  double displacement,  int cylinders) {
        super(fuelType, displacement, cylinders);
        this.batteryCapacity = batteryCapacity;
    }

}
