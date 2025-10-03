package com.java.core.selfdeveloped.sorting;

public class SelectionSort {
	public static void main(String[] args) {
		int A[]= {11,13,7,2,6,9,4,5,10,3};
		int n=A.length;
		int k;
		// for n we need n-1 passes and for each pass we need to select a particular position to insert
		//this for loop is for passes
		for(int i=0;i<n-1;i++) {
			//we need 2 pointer that also should start from o mean from i 
			// j should scan the list of all the elements upto n to find out a smaller element
			// if any smaller element is found then k will brough to that location
			// 
			for(int j=k=i;j<n;j++) {
				if(A[j]<A[k]){
					k=j;
				}
			}
			
			//once this above loop or scan is done k will be point to smallest element so we need to swap with 
			// the position which is i so k and i need to swap
				//swap the i and k
				int temp=A[i];
				A[i]=A[k];
				A[k]=temp;
		}
		
		for(int m:A) {
			System.out.print(m+" ");
		}
	}
}
