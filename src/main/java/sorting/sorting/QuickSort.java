package com.java.core.selfdeveloped.sorting;

public class QuickSort {
	
	private static void swap(int A[],int i, int j) {
		int temp;
		temp=A[i];
		A[i]=A[j];
		A[j]=temp;
	}
//	private static int partition(int A[], int l, int h) {
//		
//		int pivot=A[l];
//		int i=l,j=h;
//		do {
//			
//			do{i++;} while(A[i]<=pivot);
//			do{j--;} while(A[j]>pivot);
//			if(i<j)
//				swap(A,i,j);
//		}while(i<j);
//		swap(A,pivot,j);
//		return j;
//	}
	
	static int partitionLast(int A[], int low, int high){
	    int pivot = A[high];
	    int i = low - 1;
	    for (int j=low; j<=high; j++){
	        if (A[j] < pivot){
	            i++;
	            swap(A,i,j);
	        }
	    }
	    swap(A,i+1,high);
	    return i+1;
	}

	private static void QuickSort(int A[], int l, int h) {
		
		int j;
		if(l<h) {
			j=partitionLast(A,l,h);
			QuickSort(A, l, j-1);
			QuickSort(A, j+1, h); 
		}
	}
	
	public static void main(String[] args) {
		 int A[] = {3, 7, 9, 10, 6, 5, 12, 4, 11, 2};		
		 int n=A.length;
		 
		 //int n = sizeof(A)/sizeof(A[0]);
		 QuickSort(A,0,n-1);
		 
		 for(int m: A) {
			 System.out.print(m+" ");
		 }

	}

}
