package com.qa.Garage;

public class Runner {

	public static void main(String[] args) {

		Garage garage = new Garage();

		Car car = new Car(4 ,1 , "blue", "ford", "Car");
		garage.addVehicle(car);
		garage.getTheBill(car);

		car = new Car(6, 3, "orange", "ferrari", "Car");
		garage.addVehicle(car);
		garage.getTheBill(car);

		Bike bike = new Bike(2, 2, "pink", "BMX", "Bike");
		garage.addVehicle(bike);
		garage.getTheBill(bike);
		
		Aeroplane aeroplane = new Aeroplane( 20, 4, "silver", "Beoing", "Plane");
		garage.addVehicle(aeroplane);
		garage.getTheBill(aeroplane);

		
		garage.printGarage();

		
		garage.removeVehicle("Plane");
		
		bike = new Bike(2, 5, "yt", "BMX", "Bike");
		garage.addVehicle(bike);
		garage.getTheBill(bike);
		
		garage.removeVehicle(3);
		
		garage.printGarage();
		
		// System.out.println("Vehicle: " );
//		garage.emptyGarage();

	}
}
