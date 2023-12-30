package com.Almaz.methods;

public class MethodOverloading {
	public Double calculateArea(Double radius) {
		if(!(radius instanceof Double)) {
			return null;
		}
		return Math.PI*Math.pow(radius, 2);
	}
public Double calculateArea(Double l, Double w , String type) {
	if(!(l instanceof Double)|| !(w instanceof Double)) {
		return null;
	}
	if(type.equals("triangle")) {
		return(l*w)/2;
	}
	return l*w;
}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodOverloading methodOverloading = new MethodOverloading();
		String circleAreaResult=String.format("%.2f" ,methodOverloading.calculateArea(2.0));
		System.out.println("Circle Area:"+ circleAreaResult);
		System.out.println("Rectangle Area:"+ methodOverloading.calculateArea(2.0, 2.0, "rectangle"));
		System.out.println("Triangle Area:"+ methodOverloading.calculateArea(2.0, 4.0, "triangle"));
		
	}

}
