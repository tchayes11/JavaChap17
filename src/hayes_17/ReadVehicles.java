package hayes_17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadVehicles {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		ObjectInputStream in = new ObjectInputStream(new FileInputStream("vehicle.dat"));{
			
			try{
				Object obj = in.readObject();
				ArrayList<Vehicle> vehicles = (ArrayList<Vehicle>)obj;	
				for(Vehicle car: vehicles ){
						System.out.println(car);
						
				}
					
			} catch (Exception ex){
				System.out.println(ex.getMessage());
			}
		}
		

	}

}
