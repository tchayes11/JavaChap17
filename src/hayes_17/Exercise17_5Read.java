package hayes_17;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Exercise17_5Read {
	public static void main(String[] args) throws ClassNotFoundException, IOException {
		try (ObjectInputStream input = new ObjectInputStream(new FileInputStream("Exercise17_5.dat."));

		) {
			int[] newNumbers = (int[]) (input.readObject());

			for (int i = 0; i < newNumbers.length; i++) {
				System.out.print(newNumbers[i] + " " );
				//System.out.println();
			}
			double num = input.readDouble();
			java.util.Date date = (java.util.Date) (input.readObject());
			System.out.println();
			System.out.println(num);
			System.out.println(date);
		}
	}
}

