package com.java.core.selfdeveloped.recursion;
public class TailRecursion {
	public static void fun(int x) {
		if(x>0) {
			System.out.print(x+" ");
			fun(x-1);
		}
	}
	
	public static void main(String[] args) {

		int x=3;
		fun(x);
	}
}
