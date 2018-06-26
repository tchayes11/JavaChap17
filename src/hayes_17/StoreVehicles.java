package hayes_17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class StoreVehicles {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		ArrayList<Vehicle> vehicles = new ArrayList();
		Vehicle car = new Vehicle("Toyota", "Corolla",2014, 8000);
		vehicles.add(car);
		Vehicle car2 = new Vehicle("Hyundai", "Sonata",20007, 5000);
		vehicles.add(car2);
		Vehicle car3 = new Vehicle("Ford", "F-150", 1995, 3000);
		vehicles.add(car3);
		Vehicle car4 = new Vehicle("Chevy", "Impala",2016, 28000);
		vehicles.add(car4);
		Vehicle car5 = new Vehicle("Honda", "Accord",2000, 10000);
		vehicles.add(car5);
		Vehicle car6 = new Vehicle("Jeep", "Compass",2015, 25500);
		vehicles.add(car6);
		
		ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("vehicle.dat.",true));

		try {
				output.writeObject(vehicles);
				
				System.out.println("Success!");
			
		} catch (Exception ex){
			System.out.println(ex.getMessage());
		} finally {
			output.close();
		}
			
		
	}

}
