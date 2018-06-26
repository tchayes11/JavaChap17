package hayes_17;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Exercise17_5 {

	public static void main(String[] args) throws ClassNotFoundException, IOException {
		
		int [] numbers = {1,2,3,4,5};
		
		try(
				ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Exercise17_5.dat.",true));
		) {
		
			output.writeObject(numbers);
			output.writeDouble(5.5);
			output.writeObject(new java.util.Date());
		
		
	}

}}
