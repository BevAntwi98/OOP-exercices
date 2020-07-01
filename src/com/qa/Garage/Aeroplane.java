package com.qa.Garage;

public class Aeroplane extends Vehicle {

	public Aeroplane(int wheels, int ID, String colour, String model, String type) {
		super(wheels, ID, colour, model, type);
		// TODO Auto-generated constructor stub
	}

	private double wingSpan;

	public double getWingSpan() {
		return wingSpan;
	}

	public void setWingSpan(double wingSpan) {
		this.wingSpan = wingSpan;
	}

	
	
	
}
