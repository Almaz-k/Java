package com.Almaz.interfaces;

public class CalculatorImpl implements Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculator calculator = new CalculatorImpl();
		System.out.println(calculator.add(5.0, 9.0));
		}
	

	@Override
	public Double add(Double A, Double B) {
		// TODO Auto-generated method stub
		if(!(A instanceof Double || B instanceof Double)) {
			return null; // this line is validation or adding validator 
		}
		return A+B;
	}

	@Override
	public Double Sub(Double A, Double B) {
		// TODO Auto-generated method stub
		return A-B;
	}

	@Override
	public Double mul(Double A, Double B) {
		// TODO Auto-generated method stub
		return A*B;
	}

	@Override
	public Double div(Double A, Double B) {
		// TODO Auto-generated method stub
		return A/B;
	}
}