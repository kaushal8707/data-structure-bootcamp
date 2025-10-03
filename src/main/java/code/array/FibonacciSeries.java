package com.java.core.selfdeveloped.array;

public class FibonacciSeries {

	public static void main(String[] args) {
	
		findFibonacciUsingIteration();
		System.out.println();
		System.out.println("==============================="); 
		findFibonacciUsingRecursion();

	}
 
	private static void findFibonacciUsingRecursion() {
		for(int i=1;i<=10;i++) {
			System.out.print(fibonacciSeries(i)+" ");
		}
		
	}

	private static int fibonacciSeries(int i) {
		if(i==1) {
			return 0;
		}else if(i==2 || i==3) {
			return 1;
		}else {
			return fibonacciSeries(i-1)+fibonacciSeries(i-2);
		}
		
	}

	private static void findFibonacciUsingIteration() {
		int totalCount=10;
		int a=0;
		int b=1;
		int i=0;
		System.out.print(a+" "+b+" ");
		while(i<totalCount-2) {
			int sum=a+b;
			System.out.print(sum+" ");
			a=b;
			b=sum;
			i++;
		}
	}
}
