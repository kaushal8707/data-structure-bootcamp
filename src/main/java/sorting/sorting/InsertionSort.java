package com.java.core.selfdeveloped.sorting;

public class InsertionSort {
	public static void main(String[] args) {
		int A[]={11,13,7,12,16,9,24,5,10,3};
		int n=A.length;
		
		for(int i=1;i<A.length;i++) {
			// i am going to pick unsorted array elements from index 1st and storing each element in x and i am assuming 0th index is sorted which always be (i-1) 
			int j=i-1;
			int x=A[i];
			
			// for shifting an elements if A[j]>x and then every time j should decrement for each other value and move that element to j+1
			
			while(j>-1 && A[j]>x) {
				A[j+1]=A[j];
				j--;
			}
			
			// when we are checking j decremented value once the element less than than we need to insert at j+1 position bcz jth position value would be smaller
			// next to that element we need to stop checking of j once it is reaches till 0 i.e it should > -1;
			A[j+1]=x;
		}
		
		for(int m:A) {
			System.out.print(m+" ");
		}
	}
}
