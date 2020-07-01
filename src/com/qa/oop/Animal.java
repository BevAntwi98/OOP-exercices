package com.qa.oop;

public class Animal {

	private String sleep;

	private String eat;

	private boolean fly = false;

	public Animal(String sleep, String eat, boolean fly) {
		super();
		this.sleep = sleep;
		this.eat = eat;
		this.fly = fly;
	}
	
	public Animal () {
		
	}

	public String munch() {
		return ("onmonmon");
	}

	public String getSleep() {
		return sleep;
	}

	public void setSleep(String sleep) {
		this.sleep = sleep;
	}

	public String getEat() {
		return eat;
	}

	public void setEat(String eat) {
		this.eat = eat;
	}

	public boolean isFly() {
		return fly;
	}

	public void setFly(boolean fly) {
		this.fly = fly;
	}
}
