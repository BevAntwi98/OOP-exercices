package com.qa.Garage;

public class Bike extends Vehicle  {

	public Bike(int wheels, int ID, String colour, String model, String type) {
		super(wheels, ID, colour, model, type);
		// TODO Auto-generated constructor stub
	}

	private String bellNoise;

	public String getBellNoise() {
		return bellNoise;
	}

	public void setBellNoise(String bellNoise) {
		this.bellNoise = bellNoise;
	}

	
}
