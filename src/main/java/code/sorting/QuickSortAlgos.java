package com.java.core.selfdeveloped.sorting;

public class QuickSortAlgos {

	// A utility function to swap two elements
	private static void swap(int[] arr, int i, int j) {
		int temp=arr[i];
		arr[i]=arr[j];
		arr[j]=temp;
	}
	
	// This function takes last element as pivot, places the pivot element at its correct position
    // in sorted array, and places all smaller to left of pivot and all greater elements to right of pivot
	private static int partition(int[] arr, int l, int h) {
       
		
		int pivot=arr[h];		//// Choosing the pivot
		int i=l-1;     //// Index of smaller element and indicates the right position of pivot found so far
		for(int j=l;j<h;j++) {
			if(arr[j]<pivot) {			// If current element is smaller than the pivot
				i++;					// Increment index of smaller element
				swap(arr,i,j);
			}
		}
		swap(arr,i+1,h);
		return i+1;
	}

	private static void quicksort(int[] arr, int l, int h) {
		if(l<h) {
			int pi=partition(arr,l,h);		// pi is partitioning index, arr[p]
            								// is now at right place
			quicksort(arr, l, pi-1);		//  Separately sort elements before partition
			quicksort(arr, pi+1, h); 		////  Separately sort elements after partition
		}
	}

	public static void main(String[] args) {
        int[] arr = { 10, 7, 8, 9, 1, 5 };
        int l=0;
        int h=arr.length-1;
        quicksort(arr,l,h);
       printSortedArray(arr);			//// To print sorted array
	}

	private static void printSortedArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		
	}	
}
