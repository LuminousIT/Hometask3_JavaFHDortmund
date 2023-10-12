
public class Main {
	public static void main(String[] args) {
        // Create Manufacture and Engine instances for demonstration
        Manufacture toyotaManufacture = new Manufacture("Toyota", "Japan", 1970);
        Engine toyotaEngine = new Engine("Gasoline", 2.0, 2);
        
        Manufacture chevroletManufacture = new Manufacture("Chevrolet", "USA", 1965);
        Engine chevyEngine = new Engine("Gasoline", 2.5, 4);
        
        Manufacture mercedesManufacture = new Manufacture("Merceded Benz", "Germany", 1945);
        Engine mercedesEngine = new Engine("Hybrid", 2.0, 2);
        
        Manufacture teslaManufacture = new Manufacture("Tesla", "USA", 2005);
        Engine teslaEngine = new Engine("Electric", 1.5, 2);

        // Create arrays of Vehicle
        Vehicle[] vehicles = new Vehicle[4];

        // Create ICEV, BEV, and HybridV instances
        ICEV icev = new ICEV(toyotaManufacture, toyotaEngine, "Camry", 1994, "Black", 30000, 240, 90);
        BEV bev = new BEV(chevroletManufacture, chevyEngine, "Chevy  Truck", 2001, "Blue", 35000, 180, null);
        HybridV hybrid = new HybridV(mercedesManufacture, mercedesEngine, "Mercedes", 2004, "Silver", 40000, 100, 99);
        BEV electric = new BEV(teslaManufacture, teslaEngine, "S-Model", 2012, "Silver", 30000, 200, null);
        

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
