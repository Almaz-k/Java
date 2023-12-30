package com.Almaz.ControlStatments;

import java.util.Scanner;
public class Gradecalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("enter score");
		Scanner scanner = new Scanner(System.in);
		
		double score = scanner.nextDouble();
		char grade = 'F';
		if(score>=90 && score <=100) {
			grade = 'A';
		}else if (score>=80 && score <90) {
			grade ='B';
		}else if (score >=70 && score<80) {
			grade='C';
		}
		System.out.println("grade " + grade);
	}

}
