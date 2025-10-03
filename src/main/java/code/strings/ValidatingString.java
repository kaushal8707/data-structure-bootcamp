package com.java.core.selfdeveloped.strings;

public class ValidatingString {

	private static boolean validate(String password) {
		char A[]=password.toCharArray();
		boolean flag=false;
		for(int i=0;i<A.length;i++) {
			if( !(A[i]>=65 && A[i]<=90) &&
					!(A[i]>=97 && A[i]<=122) &&
						!(A[i]>=48 && A[i]<=57)) {
				flag=true;
				break;
			}else {
				flag=false;
			}
		}
		return flag;
		
	}
	
	public static void main(String[] args) {
		String password1="KrTum5h87@7";
		String password2="KrTum5h8707";

		if(validate(password1)) {
			System.out.println("In Valid Password");
		}else {
			System.out.println("Valid Password"); 
		}

	}
}
