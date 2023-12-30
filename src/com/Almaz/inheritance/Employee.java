package com.Almaz.inheritance;
//public final class Employee {//adding final will not extend the class anymore

public  class Employee {
	private String name;
	private Double salary;
 public Employee(String name, Double salary) {
	this.name = name;
	this.salary = salary;
 }
 public String toString() {
	return this.name + " " + this.salary;
 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager manager = new Manager("Almazk",3000.0, 1000.0);
		 manager.displayNameAndSalary();
	}
	
}

class Manager extends Employee {
	private Double bonus;
	Manager(String name, Double salary, Double bonus){
		super(name,salary);
		this.bonus = bonus;
	}
		public void displayNameAndSalary() {
			System.out.println(super. toString());
		}
}

