
public class BEV extends Vehicle {
	private double batteryCapacity;
	
	public BEV(Manufacture manufacture, Engine engine, String model, int manufactureYr, String color, double price) {
		super(manufacture, engine, model, manufactureYr, color, price);
	    this.batteryCapacity = batteryCapacity;
	    
	}
	
	public double getBatteryCapacity() {
        return batteryCapacity;
    }

	public void ShowCharacteristics() {
        System.out.println("Electric Vehicle");
        System.out.println("Manufacturer: " + getManufacture().getMake());
        System.out.println("Country: " + getManufacture().getCountry());
        System.out.println("Model: " + getModel());
        System.out.println("Color: " + getColor());
        System.out.println("Price: " + getPrice());
        System.out.println("Battery Capacity " + batteryCapacity);
        System.out.println("Engine Type: " + getEngine().getFuelType());
	} 
}
