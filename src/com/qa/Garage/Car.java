package com.qa.Garage;

public class Car extends Vehicle {

	public Car(int wheels, int ID, String colour, String model, String type) {
		super(wheels, ID, colour, model, type);
		// TODO Auto-generated constructor stub
	}

	private boolean Ferrari = true;

	public boolean isFerrari() {
		return Ferrari;
	}

	public void setFerrari(boolean ferrari) {
		Ferrari = ferrari;
	}
	
	
}
