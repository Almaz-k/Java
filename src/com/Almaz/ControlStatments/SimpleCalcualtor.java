package com.Almaz.ControlStatments;

import java.util.Scanner;

public class SimpleCalcualtor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner =new Scanner (System.in);
		System.out.println("enter first number");
		double num1 =scanner.nextDouble();
		
		System.out.println("enter second number");
		double num2 = scanner.nextDouble();
		
		//double num1 = 6, num2 = 4;
		//analysis chose an operation  + - / or * use if else if or switch
		System.out.println("choose operation");
		String removeNewLine = scanner.nextLine();
		char choice =scanner.nextLine().charAt(0);

		//String choice = "+ ";
		if (choice == '+') {
			double sum= num1 +num2;
			System.out.println("sum " + sum);
		}else if (choice=='-') {
			double sub= num1-num2;
			System.out.println("Sub " + sub);
		}else if (choice=='*') {
			double product = num1*num2;
			System.out.println("Mul " +product);
		}else if (choice=='/') {
			double div = num1/num2;
			System.out.println("div " +div);
		}
		scanner.close();
	}

}
