package com.java.core.selfdeveloped.recursion;

public class Fibonacci_Recursion {
	static int febonacci(int n) {
		if(n<=1) {
			return n;
		}else {
			return febonacci(n-2)+febonacci(n-1);
		}
	}
	public static void main(String[] args) {
		for(int i=0;i<10;i++) {
		System.out.println(febonacci(i));
		}
	}
}
