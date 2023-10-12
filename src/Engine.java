
public class Engine {
//	protected so accessible by subclasses
	protected String typeOfFuelUsed;
	protected double disp;
	protected int numOfCylinders;
	
	public Engine(String typeOfFuelUsed, double displacement, int numOfCylinders) {
		this.typeOfFuelUsed = typeOfFuelUsed;
		this.disp = displacement;
		this.numOfCylinders = numOfCylinders;
	}
		    
    public String getFuelType() {
    	return typeOfFuelUsed;
    }
    
    public double getDisplacement() {
    	return disp;
    }
    public int getTotalCylinders() {
    	return numOfCylinders;
    }
}
