package com.qa.oop;

public class Horse extends Animal {

	public String munch() {
		return ("crunchcrunch");
	}

	private int legs = 4;
	

	public int getLegs() {
		return legs;
	}

	public void setLegs(int legs) {
		this.legs = legs;
	}
	

}