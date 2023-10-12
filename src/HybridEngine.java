
public class HybridEngine extends Engine {
	private double batteryCapacity;

    public HybridEngine(String fuelType, double batteryCapacity) {
        super(fuelType);
        this.batteryCapacity = batteryCapacity;
    }

}
