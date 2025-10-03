package com.java.core.selfdeveloped.sorting;
public class BubbleSort_Algorithm {
	//number of passes should be n-1 = (5-1) = 4
	// number of comparison should be reduced by 1 after each passes bcz the greatest elements will
	// get sorted after each passes.....so, after 1 pass 1 element got sorted, after 2 pass 2 elements got sorted
	// after 3 pass 3 elements got sorted.....
	
	static void bubbleSort(int[] arr, int n) {
		for(int i=0;i<n-1;i++) {				// number of pass = (n-1)=10-1=9
			for(int j=0;j<(n-1-i);j++) {		// number of max comparison (n-1-i) where i is the sortest in each passes
				if(arr[j+1]<arr[j]) 			 
				{
					 int temp = arr[j+1];
					 arr[j+1] =  arr[j];
					 arr[j] = temp;
				}
			}
			
		}
	}
	public static void main(String[] args) {
		int arr[]= {3,7,9,10,6,5,12,4,11,2}; 
		int n=arr.length;
		bubbleSort(arr,n);
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+" ");
		}
	}
}
