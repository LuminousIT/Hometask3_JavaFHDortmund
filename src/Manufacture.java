import java.util.UUID;

public class Manufacture {
	private String make;
	private String country;
	
	public Manufacture(String make, String country ) {
		this.make = make;
		this.country = country;
	}
	
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		make = make;
	}
	
	public String getCountry() {
		return country;
	}
	
	public void setCountry(String country) {
		country = country;
	}

}
