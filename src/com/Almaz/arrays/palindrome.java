package com.Almaz.arrays;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		//analysis collect or concat the characters from left to right 
		//and right to left then compare both then if they are equal
		// they are palindrome 
		//how to do ? to concat then we can use the + for concat if there is 
		//away in java
		String left ="", right ="";
		String[] array ={"a", "a"};
		
		//for(char letter: array ) {}
		for(int leftCounter1 =0, rightCounter2= array.length-1;
				leftCounter1<=array.length-1 && rightCounter2>=0;
				leftCounter1++, rightCounter2--
				) {
			
			
			left = left.concat(array[leftCounter1]);
			right = right.concat(array[rightCounter2]);
		}
		if(left.equals(right)) {
	 System.out.println("this is Palindrome");
		}
	}

}
