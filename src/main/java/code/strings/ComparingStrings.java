package com.java.core.selfdeveloped.strings;

public class ComparingStrings {

	public static void main(String[] args) {

		String str1="painting";
		String str2="pain";
		int i=0;
		int j=0;
		int flag=0;

		while(i<str1.length() && j<str2.length()) {
			if(str1.charAt(i)!=str2.charAt(j)) {
				flag=1;
				break;
			}
				i++;
				j++;
		}
		
		if(flag==1 || str1.length()!=str2.length()) {
			System.out.println("Not equal");
		}else {
			System.out.println("Equal");
		}
		
	}

}
