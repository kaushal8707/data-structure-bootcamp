package com.java.core.selfdeveloped.array;

public class ReversingAnArray {

	public static void main(String[] args) {
		int arr[]= {5,2,9,3,6,4,1,8,7};
		int revArray[]=new int[arr.length];
		int j=0;
		for(int i=arr.length-1;i>=0;i--) {
			revArray[j]=arr[i];
			j++;
		}
		for(int k:revArray) {
			System.out.print(k+" ");
		}
		System.out.println();
		System.out.println("=============== s e c o n d - w a y =================");
		
		int arr1[]= {15,12,19,13,16,14,11,18,17};
		for(int p=0,q=arr1.length-1;p<arr1.length/2;p++,q--) {
			int temp;
			temp=arr1[p];
			arr1[p]=arr1[q];
			arr1[q]=temp;
		}
		for(int k:arr1) {
			System.out.print(k+" ");
		} 
	}

}
