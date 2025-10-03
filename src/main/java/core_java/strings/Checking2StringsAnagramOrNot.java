package com.java.core.selfdeveloped.strings;

public class Checking2StringsAnagramOrNot {

	public static void main(String[] args) {
		String str1="medica";
		String str2="decimal";
		if(str1.length()!=str2.length()) {
			System.out.println(str1+" is not an Anagram for "+str2);
		}
		for(int i=0;i<str1.length();i++) {
			boolean flag=false;
			for(int j=0;j<str2.length();j++) {
				if(str1.charAt(i)==str2.charAt(j)) {
					flag=true;
				}
			}
			if(!flag) {
				System.out.println(str1+" is not an Anagram for "+str2); 
			}
		}

	}

}
