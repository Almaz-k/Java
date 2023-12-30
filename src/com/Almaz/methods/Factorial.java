package com.Almaz.methods;

public class Factorial {

public int factorial(int n) {
	if (n<=1) {
		return 1;
	}
	return n*factorial(n-1);
	
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Factorial factorial = new Factorial();
		int factorialResult= factorial.factorial(6);
		System.out.println("factorial result" +factorialResult);
	}

}
