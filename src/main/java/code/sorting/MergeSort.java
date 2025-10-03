package com.java.core.selfdeveloped.sorting;

public class MergeSort {

	// Main function that sorts arr[l..r]
	void sort(int arr[], int l, int r) {
		if(l<r) {
			int m=l+(r-l)/2;
			sort(arr,l,m);
			sort(arr,m+1,r);
			
			merge(arr,l,m,r);
		}
	}
	
	
	// Merges two subarrays of arr[].
    // First subarray is arr[l..m]
    // Second subarray is arr[m+1..r]
	void merge(int[] arr, int l, int m, int r) {

        // Find sizes of two subarrays to be merged
		int n1=m-l+1;
		int n2=r-m;
		
        /* Create temp arrays */
		int arr1[]=new int[n1];
		int arr2[]=new int[n2];
		
        /*Copy data to temp arrays*/
		for(int i=0;i<n1;i++) {
			arr1[i]=arr[l+i];}
		for(int j=0;j<n2;j++) {
			arr2[j]=arr[m+1+j];}
		
        /* Merge the temp arrays */
		int i=0,j=0;
		
        // Initial index of merged subarray array
		int k=l;
		while(i < n1 && j < n2) {
			if(arr1[i]<=arr2[j]) {
				arr[k]=arr1[i];
				i++;
			}else {
				arr[k]=arr2[j];
				j++;
			}
			k++;
		}
		
        /* Copy remaining elements of arr1[] if any */
		while(i < n1){
				arr[k]=arr1[i];
				i++;
				k++;
		}
        /* Copy remaining elements of arr2[] if any */
		while(j < n2){
				arr[k]=arr2[j];
				j++;
				k++;
		}
	}

	public static void main(String[] args) {
        int arr[] = {11,13,7,12,16,9,24,5,10,3};
        int l=0;
        int r=arr.length-1;
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(arr,l,r);
        for(int m:arr) {
        	System.out.print(m+" ");
        }
	}

}
