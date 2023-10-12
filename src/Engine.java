
public class Engine {
//	protected so accessible by subclasses
	protected String typeOfFuelUsed;
	
	public Engine(String typeOfFuelUsed) {
		this.typeOfFuelUsed = typeOfFuelUsed;
	}
		    
    public String getFuelType() {
    	return typeOfFuelUsed;
    }
}
