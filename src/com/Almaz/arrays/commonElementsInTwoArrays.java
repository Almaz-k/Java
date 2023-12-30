package com.Almaz.arrays;

public class commonElementsInTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//analysis to pick array elements from the first array and 
		//check against the second array elements
		//then if it matches printout the element
		//how to do ?Nested for loop 
		//
		int [] arr1 = {1,2,3}, arr2 = {4,5,6,1,2};
		
		for(int num1:arr1) {
			for(int num2:arr2) {
				if(num1 ==num2) {
					System.out.println(num1);
					break;
				}
			}
		}
	}	 
}

