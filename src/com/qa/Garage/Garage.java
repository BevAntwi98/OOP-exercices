package com.qa.Garage;

import java.util.ArrayList;
import java.util.List;

public class Garage {

	List<Vehicle> garage = new ArrayList<>();

	public int getTheBill(Vehicle vehicle) {

		int bill = vehicle.getWheels() * 2000;
		System.out.println("Vehicle fixed. your bill is: " + bill);
		return (bill);

	}

	public void addVehicle(Vehicle vehicle) {

		garage.add(vehicle);

	}

	public void removeVehicle(int ID) {

		for (int i = 0; i < garage.size(); i++) {
			Vehicle vehicle = garage.get(i);
			if (vehicle.getID() == ID) {
				garage.remove(i);
				System.out.println("Vehicle ID " + vehicle.getID() + " of type " + vehicle.getType() + " deleted");
			}

		}
	}

	public void removeVehicle(String vehicle_type) {

		for (int i = 0; i < garage.size(); i++) {
			Vehicle vehicle = garage.get(i);
			if (vehicle.getType() == vehicle_type) {
				garage.remove(i);
				System.out.println("Vehicle ID " + vehicle.getID() + " of type " + vehicle.getType() + " deleted");
			}
		}
	}

	public void emptyGarage() {

		garage.clear();
		System.out.println("Garage cleared.");
	}

	public void printGarage() {
		System.out.println("Garage Contents/ Garage NAow");
		for (int i = 0; i < garage.size(); i++) {
			Vehicle vehicle = garage.get(i);

			System.out.println(" Type: " + vehicle.getType() + ", ID: " + vehicle.getID() + ", Colour: "
					+ vehicle.getColour() + ", Wheels : " + vehicle.getWheels());
		}

	}
}
