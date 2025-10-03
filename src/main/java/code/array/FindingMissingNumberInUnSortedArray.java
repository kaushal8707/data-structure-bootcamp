package com.java.core.selfdeveloped.array;

public class FindingMissingNumberInUnSortedArray {

	public static void main(String[] args) {
		int A[]= {3,7,4,9,6,1,11,2,10};
		
		int lowest_In_Array=1;
		int highest_In_Array=11;   /// i need to create a new array with with index with highest number
		int newArr[]=new int[highest_In_Array+1];
		for(int i=0;i<A.length;i++) {
			newArr[A[i]]++;
		}
		
		for(int i=1;i<newArr.length;i++) {
			if(newArr[i]==0) {
				System.out.print(i+" ");
			}
		}
		
	}
}
