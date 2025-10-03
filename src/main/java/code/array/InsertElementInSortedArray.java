package com.java.core.selfdeveloped.array;

//Steps
//First get the element to be inserted, say x
//Then get the position at which this element is to be inserted, say pos
//Create a new array with the size one greater than the previous size
//Copy all the elements from previous array into the new array till the position pos
//Insert the element x at position pos
//Insert the rest of the elements from the previous array into the new array after the pos

public class InsertElementInSortedArray {
	public static void main(String[] args) {
		int arr[]= {2,5,18,20,29,32,40};
		int sortedArray[]=new int[arr.length+1];
		int x=31;    //value to be inserted in sorted array
		int position=0;   ////to get position to insert 31
		int i=0;
		while(i<arr.length) {
			if(arr[i]<x) {
				sortedArray[i]=arr[i];
				position++;
			}else {
				sortedArray[i+1]=arr[i];
			}
			i++;
		}
		sortedArray[position]=x;
		for(int  k:sortedArray) {
			System.out.print(k+" ");
		}
	}
}
