
public class Main {
	public static void main(String[] args) {
        // Create Manufacture and Engine instances for demonstration
        Manufacture toyotaManufacture = new Manufacture("Toyota", "Japan");
        Engine toyotaEngine = new Engine("Gasoline");
        
        Manufacture chevroletManufacture = new Manufacture("Chevrolet", "USA");
        Engine chevyEngine = new Engine("Gasoline");
        
        Manufacture mercedesManufacture = new Manufacture("Merceded Benz", "Germany");
        Engine mercedesEngine = new Engine("Hybrid");
        
        Manufacture teslaManufacture = new Manufacture("Tesla", "USA");
        Engine teslaEngine = new Engine("Electric");

        // Create arrays of Vehicle
        Vehicle[] vehicles = new Vehicle[4];

        // Create ICEV, BEV, and HybridV instances
        ICEV icev = new ICEV(toyotaManufacture, toyotaEngine, "Camry", 1994, "Black", 30000);
        BEV bev = new BEV(chevroletManufacture, chevyEngine, "Chevy  Truck", 2001, "Blue", 35000);
        HybridV hybrid = new HybridV(mercedesManufacture, mercedesEngine, "Mercedes", 2004, "Silver", 40000);
        BEV electric = new BEV(teslaManufacture, teslaEngine, "S-Model", 2012, "Silver", 30000);
        

        // Add instances to the array
        vehicles[0] = icev;
        vehicles[1] = bev;
        vehicles[2] = hybrid;
        vehicles[3] = electric;

        // Iterate through the array and show characteristics of each vehicle
        for (Vehicle vehicle : vehicles) {
            vehicle.ShowCharacteristics();
            System.out.println();
        }
    }
}
