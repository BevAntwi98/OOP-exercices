package com.qa.Garage;

public abstract class Vehicle {

	private int ID;
	private int wheels;
	private String colour;
	private String model;
	private String type;

	
	public Vehicle(int wheels, int ID, String colour, String model, String type) {
		super();
		this.wheels = wheels;
		this.ID = ID;
		this.colour = colour;
		this.model = model;
		this.type = type;
		
	}
	


	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public int getID() {
		return ID;
	}

	public void setID(int iD) {
		ID = iD;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}



	public String getModel() {
		return model;
	}



	public void setModel(String model) {
		this.model = model;
	}



	public String getType() {
		return type;
	}



	public void setType(String type) {
		this.type = type;
	}

	
}
