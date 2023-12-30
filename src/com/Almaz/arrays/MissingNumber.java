package com.Almaz.arrays;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.IntStream;

public class MissingNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Integer[]arr= {1,2,4};
		
		//Optional<Integer> max =Arrays.stream(arr)
				//.max(Comparator.comparingInt(num->num));
			//System.out.println(max);
		int[] arr= {1,2,4};
		int max= Arrays.stream(arr)
				.max()
				.orElse(0);
			System.out.println("max" +max);
			int sum =Arrays.stream(arr)
					.sum();
			System.out.println("sum" +sum);
			
			int expectedSum = IntStream.rangeClosed(1,max).sum();
			
			//for (int i=1;i<= max;i++) {
				//expectedSum +=i;
			//}
			int missingNumber =expectedSum-sum;
			System.out.println("missed number" + missingNumber);
	}

}
