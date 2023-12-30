package com.Almaz.inheritance;

public class Vehicle {
//method overriding 
	public void fuelSource() {
		System.out.println("vehicle fuel, ");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//Vehicle vehicle = new Vehicle();
	//Vehicle car = new Car();
	//Vehicle bicycle = new Bicycle();
	//System.out.println(vehicle.fuelSource());//can´t be printed becuse of the need of return of an object 
	//Overriding 
	//vehicle.fuelSource();
	//car.fuelSource();
	//bicycle.fuelSource();
	
// Invoking 
		Vehicle vehicle = new Vehicle();
		//Vehicle car = new Car();
		Vehicle bicycle = new Bicycle();
		Car car = new Car();
		vehicle.fuelSource();
		car.displayMessage();
		bicycle.fuelSource();

	}

}
//overriding
 class Car extends Vehicle{
	//public void fuleSource() {//fuleSource is same signature we using
		//System.out.println("car fuel");
	//}
	//use Super if not wish to override 
	public void fuelSource() {
		 super.fuelSource();//  prevents override. the message will be Vehicle fuel

	}

	public void displayMessage() {
		// TODO Auto-generated method stub
		
	}
}
class  Bicycle extends Vehicle{
	public void fuelSource() {
		System.out.println("Bicycle fuel");
	}
}