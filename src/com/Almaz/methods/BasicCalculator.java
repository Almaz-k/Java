package com.Almaz.methods;

public class BasicCalculator {
	//
	public Integer add(Integer a, Integer b) {
		if(a==null|| b== null) {
			return null;
		}
		if(!(a instanceof Integer)|| !(b instanceof Integer)) {
			return null;
		}
		return a+b;
		
	}
	public Double div(Double a, Double b ) {
		if(a ==null|| b == null || b==0) {
			return null;
		}
		if(!(a instanceof Double)|| !(b instanceof Double)) {
			return null;
		}
		return a/b;
	}
	
	public Integer sub(Integer a, Integer b ) {
		if(a==null|| b==null) {
			return null;
		}
		if(!(a instanceof Integer)|| !(b instanceof Integer)) {
			return null;
		}
		return a-b;
	}

	public Integer mul(Integer a, Integer b ) {
		if(a==null|| b==null) {
			return null;
		}
		if(!(a instanceof Integer)|| !(b instanceof Integer)) {
			return null;
		}
		return a*b;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
 //analysis we have four task to add, div, sub and Mul
		//how to solve ? using methods
	BasicCalculator basicCalculator=new BasicCalculator();
	Integer addResult = basicCalculator.add(2, 3);// invoking 
	Double divResult = basicCalculator.div(4.0, 5.0);// invoking 
	Integer  subResult = basicCalculator.sub(7, 8);// invoking 
	Integer mulResult = basicCalculator.mul(9, 10);// invoking 

	System.out.println("add Results" +addResult);
	System.out.println("div Results" +divResult);
	System.out.println("sub Results" +subResult);
	System.out.println("mul Results" +mulResult);

	}

}
