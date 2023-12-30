
package com.Almaz.arrays;

//[1,2,3,4]=>[4,3,2,1]
public class Exercise1Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//analysis
		// what do is to reverse an array;
		//how to do is just we have to swap numbers in the same array;
		//we need two counter one is ASC, the other is desc
		//stop conditions if the number of array is odd stop
		// swapping when both counter become equal;
		// when the number of array is even stop swapping
		// when counter 2 or descending counter less than the asc
int[] nums = {1,2,3,4,5};
	for(int counter1= 0, counter2=nums.length-1
			;counter1<nums.length && counter2>=0;
			counter1++, counter2--
			){
	if(nums.length%2!=0 && counter1==counter2){
		break;
	}else if (counter2<counter1){
	break;
	}
	int swappingVariable = nums[counter1];//1
	nums[counter1]= nums[counter2];//4
	nums[counter2]= swappingVariable;//1
		}
	System.out.println("Reversed array");
	for (int number:nums) {
		System.out.println(number);
	}
	}

}
