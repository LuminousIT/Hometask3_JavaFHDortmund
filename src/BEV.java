
public class BEV extends Vehicle {
	private double batteryCapacity;
	  private int range;
	    private String chargingType;
	
	public BEV(Manufacture manufacture, Engine engine, String model, int manufactureYr, String color, double price, int range, String chargingType) {
		super(manufacture, engine, model, manufactureYr, color, price);
	    this.batteryCapacity = batteryCapacity;
	    this.range = range;
        this.chargingType = chargingType;
	    
	}
	
	public double getBatteryCapacity() {
        return batteryCapacity;
    }

	public int getRange() {
		return range;
	}

	public String getChargingType() {
		return chargingType;
	}

	@Override
	public void ShowCharacteristics() {
        System.out.println("Electric Vehicle");
        System.out.println("Manufacturer: " + getManufacture().getMake());
        System.out.println("Country: " + getManufacture().getCountry());
        System.out.println("Model: " + getModel());
        System.out.println("Color: " + getColor());
        System.out.println("Price: " + getPrice());
        System.out.println("Battery Capacity " + getBatteryCapacity());
        System.out.println("Charging Type " + getChargingType());
        System.out.println("Range: " + getRange());
        System.out.println("Engine Type: " + getEngine().getFuelType());
	} 
}
