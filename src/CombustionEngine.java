
public class CombustionEngine extends Engine {
	private int cylinders;
	
    public CombustionEngine(String fuelType, double displacement,  int cylinders) {
        super(fuelType, displacement, cylinders);
        this.cylinders = cylinders;
    }

}
