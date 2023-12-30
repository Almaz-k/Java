package com.Almaz.methods;

public class Fibonancci {
//Fibonancci is a sum of the previous 2 numbers and the mathematical formula is f(n)= f(n-1)+f(n-2)
	public Integer fibonancci(Integer n) {
		if(!(n instanceof Integer)) {
			return null;
		}
		if(n<=1) {
			return n;
		}
		return fibonancci(n-1)+ fibonancci(n-2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fibonancci fibo =new Fibonancci();
		System.out.println(fibo.fibonancci(10));
	}
}
