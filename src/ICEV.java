
public class ICEV extends Vehicle {
	private String fuelType;
	  private int topSpeed;
	    private double fuelEfficiency;
	
    public ICEV(Manufacture manufacture, Engine engine, String model, int manufactureYr, String color, double price, int topSpeed, double fuelEfficiency) {
		super(manufacture, engine, model, manufactureYr, color, price);
		 this.fuelType = fuelType;
		 this.topSpeed = topSpeed;
		 this.fuelEfficiency = fuelEfficiency;
	}

    public String getFuelType() {
        return fuelType;
    }
	
    public int getTopSpeed() {
		return topSpeed;
	}

	public double getFuelEfficiency() {
		return fuelEfficiency;
	}

	@Override
	public void ShowCharacteristics() {
        System.out.println("Internal Combustion Engine Vehicle");
        System.out.println("Manufacturer: " + getManufacture().getMake());
        System.out.println("Country " + getManufacture().getCountry());
        System.out.println("Year founded " + getManufacture().getFoundingYear());
        System.out.println("Model: " + getModel());
        System.out.println("Color: " + getColor());
        System.out.println("Price: " + getPrice());
        System.out.println("Engine Type: " + getEngine().getFuelType());
        System.out.println("Speed: " + getTopSpeed());
        System.out.println("Efficiency: " + getFuelEfficiency());
        
	} 
}
