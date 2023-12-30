package com.Almaz.ControlStatments;
import java.util.Scanner;
public class EvenorOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter year");
		
		Scanner scanner = new Scanner (System.in);
		int year = scanner.nextInt();
		if(year%4==0) {
			System.out.println(year + "is leap year.");
		}
		System.out.println("enter number");
		int number = scanner.nextInt();
		if(number%2==0) {
			System.out.println("number is even");
		}else
			System.out.println("number is odd");
	}

}
