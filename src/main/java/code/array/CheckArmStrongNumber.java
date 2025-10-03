package com.java.core.selfdeveloped.array;

//153 = (1*1*1)+((5*5*5)+(3*3*3) = 153 
public class CheckArmStrongNumber {

	public static void main(String[] args) {
		int number=153;
		int originalNum=number;
	    int sumOfCube=0;
		int rem=0;
		while(number!=0) {
			rem=number%10;
			sumOfCube=sumOfCube+(rem*rem*rem);
			number=number/10;
		}
		if(originalNum==sumOfCube) {
			System.out.println(originalNum+" is Armstrong Number");
		}else {
			System.out.println(originalNum+" is not an Armstrong Number");

		}

	}

}
