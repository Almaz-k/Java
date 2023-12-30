package com.Almaz.datastructure;


import java.util.List;

public class MergeSort {
	public static Integer[] merge(Integer[] arr, Integer l,Integer m, Integer r){
		Integer [] leftSubArray = new Integer[(m-l)+1];
		Integer [] rightSubArray = new Integer[(r-m)+1];
		Integer [] mergedArray = new Integer[(r-l)+1];//length decleration
		
		//filling out the left subArray iteration process
		Integer k=0;
		for (int i=l;i<=m; i++) {
			leftSubArray[k++]=arr[i];
		}
		//filling out the right subArray iteration process
			Integer j=0;
				for (int i=r;i<=m; i++) {
					leftSubArray[j++]=arr[i];
				}
	//merging is next step how by creating merged array first in line9
		// and create for loop, filling out merged array from the left subArray 
		//determine size of merged Array
		//
		Integer [] mergedArray = new Integer[(r-l)+1];
				for(int i=0; i<leftSubArra.legth; i++) {}
	}

	public static Integer[] divide(Integer[] arr, Integer l, Integer r){
		if(l==r) {
			return arr;
		}
		if(l<r) {
			Integer m = (l+r)/2;
			divide(arr,l,m);
			divide(arr, m+1,r);
			merge(arr,l,m,r);
			
					
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
