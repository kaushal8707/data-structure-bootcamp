package com.java.core.selfdeveloped.strings;

public class CheckingPalindrome {

	public static void main(String[] args) {
		String str="abcba";
		boolean flag=checkPalindromeUsingIteration(str);
		if(!flag) {
			System.out.println("P");
		}		
		
		boolean status=checkPalindromeUsingRecursion(str);
		if(status) {
			System.out.println("Palindrome"); 
		}
		
	}

	private static boolean checkPalindromeUsingRecursion(String str) {
		if(str.length()==0 || str.length()==1) {
			return true;
		}
		if(str.charAt(0)==str.charAt(str.length()-1)) {
			return checkPalindromeUsingRecursion(str.substring(1, str.length()-1));
		}
		return false;		
	}

	
	private static boolean checkPalindromeUsingIteration(String str) {
		boolean flag=false;
		for(int i=0,j=str.length()-1;i<str.length()/2;i++,j--) {
			if(str.charAt(i)!=str.charAt(j)) {
				flag=true;
			}
		}
		return flag;
		
	}

}
