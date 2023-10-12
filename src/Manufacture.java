import java.util.UUID;

public class Manufacture {
	private String make;
	private String country;
	private int foundingYear;
	
	public Manufacture(String make, String country, int foundingYear ) {
		this.make = make;
		this.country = country;
		this.foundingYear = foundingYear;
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

	public int getFoundingYear() {
		return foundingYear;
	}

	public void setFoundingYear(int foundingYear) {
		this.foundingYear = foundingYear;
	}

}
