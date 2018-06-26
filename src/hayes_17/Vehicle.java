package hayes_17;

import java.io.Serializable;

public class Vehicle implements Serializable{
	
	
	private static final long serialVersionUID = -5190543531091705162L;
	private String make;
	private String model;
	private int year;
	private double price;
	
	public Vehicle(String make, String model, int year, double price) {
		super();
		this.make = make;
		this.model = model;
		this.year = year;
		this.price = price;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Vehicle [make=" + make + ", model=" + model + ", year=" + year + ", price=" + price + "]";
	}
	
	
}
