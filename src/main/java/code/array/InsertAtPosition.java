package com.java.core.selfdeveloped.array;

//insert at position 4;
//Steps
//First get the element to be inserted, say x
//Then get the position at which this element is to be inserted, say pos
//Create a new array with the size one greater than the previous size
//Copy all the elements from previous array into the new array till the position pos
//Insert the element x at position pos
//Insert the rest of the elements from the previous array into the new array after the pos

public class InsertAtPosition {
	public static void main(String[] args) {
		int arr[]= {5,2,9,3,6,4,1,8,7};
		int changedArr[]=new int[arr.length+1];
		int pos=4;   	//4th position to be inserted
		int x=88;    	//value to be inserted
		for(int i=0;i<arr.length;i++) {
			if(i<pos-1) {
				changedArr[i]=arr[i];
			}else {
				changedArr[i+1]=arr[i];
			}
		}
		changedArr[pos-1]=x;
		for(int m:changedArr) {
			System.out.print(m+",");
		}
		
	}
}
