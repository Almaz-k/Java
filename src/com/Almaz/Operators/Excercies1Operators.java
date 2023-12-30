package com.Almaz.Operators;

public class Excercies1Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double num1= 6, num2 =10;
		double quotient = num1/num2;//2
		double reminder= num1%num2; //0
		
		System.out.println(" quotient " +quotient);
		System.out.println("remider " +reminder);
		
		//relational operators operators used or comparison like ==><
		double result= num1 ==num2?0:num1>num2?num1:num2;
		System.out.println(result);
		
		//unary operator ++ -- += -=~
		//create decrement  and increment counter++= counter=counter+1 
		int counter = 0;
		
		int firstCounter = counter++; //1
		System.out.println("first counter "+ firstCounter);//1
		
		int secondCounter= ++counter;//2
		
		System.out.println("second counter "+ secondCounter);//2
		
		// Divisible numbers num1 is divisible by 2 and 3 use %;&& ||
		boolean isDivisible = num1%2==0 && num1%3==0 ? true :false; // we are checking if this is true or not
		
		System.out.println("is Divisible "+ isDivisible);
		
		// 6/2,2/2 use ternary operator
		double halve = num1<1?0:num1/2;//3
		halve = halve<1?0:halve/2;// 1.5
		halve = halve<1?0:halve/2;//0.75
		halve = halve<1?0:halve/2;//0

		System.out.println("halve " +halve);
		
		
		
		
	
	}

}
