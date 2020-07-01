package com.qa.oop;

public class Runner {
	
	public static void main(String[] args) {
		
		
		Giraffe newGiraffe = new Giraffe();
		newGiraffe.munch();
		
		Snake newSnake = new Snake();
		Horse myHorse= new Horse();
		myHorse.munch();
		newSnake.munch();
		
		System.out.println(myHorse.munch());
	    System.out.println(newSnake.munch());
	    System.out.println(newSnake.noise());
//	    System.out.println(newGiraffe.eat());
	    
	    newGiraffe.eat();
	}
}
