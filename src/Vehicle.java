import java.util.UUID;

public abstract class Vehicle {
	private String id;
	private Manufacture manufacture;
	private Engine engine;
	private String model;
	private int manufactureYear;
	private String color;
	private double price;
	
	public Vehicle(Manufacture manufacture, Engine engine, String model, int manufactureYr, String color, double price) {
		this.id = UUID.randomUUID().toString();
		this.manufacture = manufacture;
		this.engine = engine;
		this.model = model;
		this.manufactureYear = manufactureYr;
		this.color = color;
		this.price = price;
	}
	
	
	
	public String getId() {
		return id;
	}

	public Manufacture getManufacture() {
	        return manufacture;
	}

	public Engine getEngine() {
	    return engine;
	}


	public String getModel() {
		return model;
	}



	public int getManufactureYear() {
		return manufactureYear;
	}



	public String getColor() {
		return color;
	}



	public double getPrice() {
		return price;
	}

	abstract void ShowCharacteristics();
	
	
}
