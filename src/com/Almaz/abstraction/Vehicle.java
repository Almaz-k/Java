package com.Almaz.abstraction;

public abstract class Vehicle {
	public abstract Double fuelEfficency ();		
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vehicle vehicle = new Car();
		System.out.println(vehicle.fuelEfficency());
		}

}

class Car extends Vehicle {
	public Double fuelEfficency(){
		return 7.00;
	}	
}

class Bike extends Vehicle{
	public Double fuelEfficency() {// this is also polymorphism 
		return 3.00; 
	}
}