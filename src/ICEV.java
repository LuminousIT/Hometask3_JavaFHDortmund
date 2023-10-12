
public class ICEV extends Vehicle {
	private String fuelType;
	
    public ICEV(Manufacture manufacture, Engine engine, String model, int manufactureYr, String color, double price) {
		super(manufacture, engine, model, manufactureYr, color, price);
		 this.fuelType = fuelType;
	}

    public String getFuelType() {
        return fuelType;
    }
	
 
	public void ShowCharacteristics() {
        System.out.println("Internal Combustion Engine Vehicle");
        System.out.println("Manufacturer: " + getManufacture().getMake());
        System.out.println("Country " + getManufacture().getCountry());
        System.out.println("Model: " + getModel());
        System.out.println("Color: " + getColor());
        System.out.println("Price: " + getPrice());
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Engine Type: " + getEngine().getFuelType());
	} 
}
