package com.Almaz.inheritance;

public class Shape {
	private Double ShapeArea;
	public Double area() {
		return this.ShapeArea;// we are not doing math except declaring generating the parent 
	}
	//we are achieving polymorphism and inheritance at the same time by declaring/ overriding the child´s area from Shapearea
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//inheritance reflection/ Invoking for inheritance , this is also overriding from the supperclass below 
			Shape circle =new Circle(1.0);// we are calling it shape not circle or else becuse circle or else are all shapes and shape substitutes for circle 
			Shape rectangel = new Rectangle (2.0,3.0);
			
			System.out.println("area of circle"+ circle.area());
			System.out.println("area of Rectangel"+ rectangel.area());
			
	}

}

class Circle extends Shape {
	Double radius;//pi2
	Circle(Double radius ){//Initializing the bases
		this.radius= radius;// radius is inherited from line 17 as double radius
	}
	public Double area() {
		return Math.PI*Math.pow(radius,2); //area is overriding here as a parent class,while circle,and rectangle areas are child's of the area of parent. they are inheriting it from area   
	}
}
class Rectangle extends Shape{
	Double L, W;
	Rectangle (Double L, Double W){
		this.L=L;
		this.W=W;
	}
	public Double area() {
		return L+W;
	}
}
