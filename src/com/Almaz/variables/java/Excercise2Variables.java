package com.Almaz.variables.java;

public class Excercise2Variables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int age= 20;
	double currenceyExchange= 78.9;
	char letter = 'B';
	age = 30;
	
	System.out.println("age: "+ age );
	System.out.println("currenceyExchange: " +currenceyExchange);
	System.out.println("letter: " +letter);
	
	String firstName = "Guahro";
	String lastName = "LLC";
	
	System.out.println(firstName + " " +  lastName);
	System.out.println(firstName.concat("").concat(lastName));
	
	int number1 = 1, number2= 2;
	int diff = number1- number2;
	int div = number1/number2;
	int mul = number1 * number2;
	int sum= number1 + number2;
	//double div = number1/number2;

	double number3=1, number4=2;
	double div2 =number3/number4;
	
	System.out.println ("sum: " +sum);
	System.out.println("diff: "+ diff);
	System.out.println("div: "+ div);
	System.out.println("mul: " +mul);
	System.out.println("div: "+ div2);
	
	//temperature conversion
	float celsius =40;
	float fraction =9/5;
	float farenheit =(celsius*fraction)+32;
	System.out.println("Celsius: " + celsius);
	System.out.println("farenheit:" + farenheit);
	
	
	// Swapping variables 
	int one =3, two =4;// how can you swap the numbers 
	//one= (one+two)-(one);//4 not working 
	//two= (one+two)-(two);//4+4-4=4 doesn´t work
	//what to do to get 3 for two??
	//int temp= one;
	//one=two;
	//two=temp;
	//System.out.println("one " +one); yes
	//System.out.println("two " +two); yes
	//System.out.println("value of one :" +one); no
	//System.out.println("value of two :" +two);no 
	one =one + two; //7
	two= one-(two);//7-4
	one= one -(two);//7-3
	System.out.println(one);
	System.out.println(two);
	//or 
	//System.out.println((one+two) -(one));
	//System.out.println((one+two) -(two));

	//area of circle
	double radius= 1.1;
	final double  PI = 3.14;
	double area= PI*radius*radius;
	System.out.println("area " +area);
	
	//Average of number
	
	int num1= 1, num2=2, num3=3;
	double  avg= (num1+num2+num3)/3;
	System.out.println("Average " +avg);
	
	// 
	
	}

}
