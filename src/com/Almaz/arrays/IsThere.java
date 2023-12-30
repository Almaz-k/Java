package com.Almaz.arrays;

public class IsThere {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//analysis
		//compare the number with against the
		//array elements
		// then if it matches then return true;
	
		int [] array = {1,2,5,7};
		boolean isThere = false;
		int numberToCheck = 3;
		 
		for (int num:array) {
			if(num==numberToCheck) {
				isThere = true;
				break;
			}
		}
		System.out.println("is there" + isThere);
	}

}
