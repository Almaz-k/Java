package com.Almaz.arrays;

public class MergeTwoArrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// analysis is to create third new array that stores
		//the values of two sorted arrays
		// how to do ? iterate over the first array then continue on the second array or 
		//use built in function f there is 
		int[] array1= {1,2,3}, array2= {4,5,6}, 
		   array3 = new int[array1.length +array2.length];
		
		   for(int i=0; i<array1.length; i++) {
			array3[i] = array1[i];//copy the first array elements to third array
		}
		   
		for(int i= array1.length,j=0; i<array3.length; i++, j++) {
			array3[i] = array2[j];// copy the second array elements to thrid array
		}
		//print out the elements of the merged array 
		for( int i=0;i<array3.length; i++ ) {
			System.out.print(array3[i]+",");
		}
		System.out.print("}");
	}

}
