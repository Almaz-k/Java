package com.Almaz.arrays;

import java.util.Arrays;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//analysis create new array and check if the array elements
		// exist in the new array if it not write or add it
		// if it there don´t write it.
		Integer [] arr = {1,1,3,3,2,2}, uniqueArray = new Integer[arr.length];
		int counter =0, k=0;
		
		for(int j =0; j<arr.length;j++) {
			for (int i=0; i<uniqueArray.length; i++) {
				if(arr[j] ==uniqueArray[i]) {
					counter++;
					break;
				}
			}
			if(counter==0) {
				uniqueArray[k++]=arr[j];
			}
			counter =0;
		
		
		}
		//improved version
	
		Integer[]uniquearrayUsingStream =Arrays
				.stream(arr)
				.distinct()
				.toArray(Integer []::new);
		 for(int number: uniquearrayUsingStream) {
			System.out.println(number);
	}
	
}
	
}
