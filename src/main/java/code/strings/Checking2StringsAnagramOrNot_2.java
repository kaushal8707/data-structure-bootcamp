package com.java.core.selfdeveloped.strings;

public class Checking2StringsAnagramOrNot_2 {

	//first sort both then compare
	public static void main(String[] args) {
		String str1="medical";
		String str2="decimal";
		
		if(str1.length()!=str2.length()) {
			System.out.println(str1+" is not an anagram of "+str2);
		}
		
		str1=getSortedString(str1);
		str2=getSortedString(str2);
		if(str1.equals(str2)) {
			System.out.println("a n a g r a m"); 
		}
	}

	private static String getSortedString(String str1) {
		char chArr[]=str1.toCharArray();
		for(int i=0;i<str1.length();i++) {
			for(int j=i+1;j<str1.length();j++) {
				if(chArr[j]<chArr[i]){
					char temp=chArr[j];
					chArr[j]=chArr[i];
					chArr[i]=temp;
				}
			}
		}
		return String.valueOf(chArr); 
	}
}