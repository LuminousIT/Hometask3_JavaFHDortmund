import java.util.ArrayList;
import java.util.List;

public class TaskA {
	public static void main(String args[]) {
		
		List<Car> listOfCars = new ArrayList<>();
//		(String make, String model, int manufactureYr, String color, double price, String regNumber)
		listOfCars.add(new Car("Toyota", "Yaris", 1994, "Black", 20000, "XY123VC" ));
		listOfCars.add(new Car("Honda", "Civic", 1996, "Red", 50000, "YH2248CS" ));
		listOfCars.add(new Car("Chevrolet", "Suv", 1997, "Blue", 10000, "HSG234H" ));
		listOfCars.add(new Car("Ford", "Truck", 1984, "Black", 30000, "XSJ234H" ));
		listOfCars.add(new Car("Honda", "Bummer", 1999, "Gray", 60000, "UEJ235CS" ));
		listOfCars.add(new Car("Toyota", "Corolla", 1994, "Silver",70000, "HJA244HJ" ));
		listOfCars.add(new Car("Honda", "Bullet", 1993, "Black", 80000, "JB345HV" ));
		listOfCars.add(new Car("Ford", "Truck", 1974, "Red", 20000, "BR8348H" ));
		listOfCars.add(new Car("Chevrolet", "Chevvy", 1982, "Black", 10000, "IS345J" ));
		listOfCars.add(new Car("Honda", "Jeep", 1993, "Black", 30000, "NJ345J" ));
		
		logCars(listOfCars);
		
	}
	
	public static void logCars(List<Car> list) {
		for (Car car : list) {
			System.out.println(car.getMake() + " " + car.getModel());
		}
	}
}
