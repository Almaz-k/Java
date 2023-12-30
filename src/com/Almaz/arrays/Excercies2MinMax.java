package com.Almaz.arrays;

public class Excercies2MinMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Analysis
		//strategy: compare every element in the array against each 
		//other then pick the min and may accordingly
		//how to do: we have two variable min and max and
		// we have to initialize then with min and max with the first array element.
		
		int[] arr = {1,2,3};
		int min = arr[0], max = arr[0];
		double avg = 0.0, sum = 0.0;
		for(int num:arr){
			if(num <min) {
				min = num;
			}
			if(num>max){
				max=num;
			}
			sum+=num;
		}
		avg= sum/arr.length;
	System.out.println("min" +min);
	System.out.println("max" +max);
	System.out.println("avg" +avg);
	
	}

	private static int arr (int i) {
		// TODO Auto-generated method stub
		return 0;
	}

}
