
public class HybridV extends Vehicle {
	 private String fuelType;
	   private double batteryCapacity;
	    private double fuelEfficiency;
	 
	public HybridV(Manufacture manufacture, Engine engine, String model, int manufactureYr, String color,
			double price,  double batteryCapacity, double fuelEfficiency) {
		super(manufacture, engine, model, manufactureYr, color, price);
		 this.fuelType = fuelType;
		  this.batteryCapacity = batteryCapacity;
	        this.fuelEfficiency = fuelEfficiency;
	}

	public String getFuelType() {
	        return fuelType;
	}
	
	
	public double getBatteryCapacity() {
		return batteryCapacity;
	}

	public double getFuelEfficiency() {
		return fuelEfficiency;
	}

	@Override
	public void ShowCharacteristics() {
        System.out.println("Hybrid Engine Vehicle");
        System.out.println("Manufacturer: " + getManufacture().getMake());
        System.out.println("Country " + getManufacture().getCountry());
        System.out.println("Year founded " + getManufacture().getFoundingYear());
        System.out.println("Model: " + getModel());
        System.out.println("Color: " + getColor());
        System.out.println("Price: " + getPrice());
        System.out.println("Fuel Type: " + getEngine().getFuelType());
        System.out.println("Battery Capacity " + getBatteryCapacity());
        System.out.println("Efficiency " + getFuelEfficiency());
        System.out.println("Engine Type: " + getEngine().getFuelType());
	} 
	
}
